/*******************************************************************************
 * Copyright (c) 2000-2011 IBM Corporation and others, eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     eBay Inc - modification
 *******************************************************************************/
package org.eclipse.dltk.mod.internal.core;

import org.eclipse.vjet.eclipse.core.IImportContainer;
import org.eclipse.vjet.eclipse.core.IImportDeclaration;
import org.eclipse.dltk.mod.core.IModelElement;
import org.eclipse.dltk.mod.core.ISourceRange;
import org.eclipse.dltk.mod.core.ISourceReference;
import org.eclipse.dltk.mod.core.ModelException;
import org.eclipse.dltk.mod.core.WorkingCopyOwner;
import org.eclipse.dltk.mod.internal.core.util.MementoTokenizer;
import org.eclipse.dltk.mod.utils.CorePrinter;

/**
 * @see IImportContainer
 */
public class ImportContainer extends SourceRefElement implements
		IImportContainer {

	public ImportContainer(AbstractSourceModule parent) {
		super(parent);
	}

	protected void closing(Object info) throws ModelException {
		// TODO Do any necessary cleanup.

	}

	public boolean equals(Object o) {
		if (!(o instanceof ImportContainer))
			return false;
		return super.equals(o);
	}

	/**
	 * @see IJavaElement
	 */
	public int getElementType() {
		return ELEMENT_TYPE;
	}

	/*
	 * @see JavaElement
	 */
	public IModelElement getHandleFromMemento(String token,
			MementoTokenizer memento, WorkingCopyOwner workingCopyOwner) {
		switch (token.charAt(0)) {
		case JEM_COUNT:
			return getHandleUpdatingCountFromMemento(memento, workingCopyOwner);
		case JEM_IMPORTDECLARATION:
			if (memento.hasMoreTokens()) {
				String importName = memento.nextToken();
				ModelElement importDecl = (ModelElement) getImport(importName);
				return importDecl.getHandleFromMemento(memento,
						workingCopyOwner);
			} else {
				return this;
			}
		}
		return null;
	}

	/**
	 * @see JavaElement#getHandleMemento()
	 */
	protected char getHandleMementoDelimiter() {
		return ModelElement.JEM_IMPORTDECLARATION;
	}

	/**
	 * @see IImportContainer
	 */
	public IImportDeclaration getImport(String importName) {
		int index = importName.indexOf(".*"); // /$NON-NLS-1$
		boolean isOnDemand = index != -1;
		if (isOnDemand)
			// make sure to copy the string (so that it doesn't hold on the
			// underlying char[] that might be much bigger than necessary)
			importName = new String(importName.substring(0, index));
		return new ImportDeclaration(this, importName, isOnDemand);
	}

	/*
	 * @see JavaElement#getPrimaryElement(boolean)
	 */
	public IModelElement getPrimaryElement(boolean checkOwner) {
		SourceModule cu = (SourceModule) this.parent;
		if (checkOwner && cu.isPrimary())
			return this;
		return new ImportContainer(cu);
	}

	/**
	 * @see ISourceReference
	 */
	public ISourceRange getSourceRange() throws ModelException {
		IModelElement[] imports = getChildren();
		ISourceRange firstRange = ((ISourceReference) imports[0])
				.getSourceRange();
		ISourceRange lastRange = ((ISourceReference) imports[imports.length - 1])
				.getSourceRange();
		SourceRange range = new SourceRange(firstRange.getOffset(),
				lastRange.getOffset() + lastRange.getLength()
						- firstRange.getOffset());
		return range;
	}

	public void printNode(CorePrinter output) {
		// do nothing
	}

	/**
	 */
	public String readableName() {

		return null;
	}

	/**
	 * @private Debugging purposes
	 */
	protected void toString(int tab, StringBuffer buffer) {
		Object info = ModelManager.getModelManager().peekAtInfo(this);
		if (info == null || !(info instanceof ModelElementInfo))
			return;
		IModelElement[] children = ((ModelElementInfo) info).getChildren();
		for (int i = 0; i < children.length; i++) {
			if (i > 0)
				buffer.append("\n"); //$NON-NLS-1$
			((ModelElement) children[i]).toString(tab, buffer);
		}
	}

	/**
	 * Debugging purposes
	 */
	protected void toStringInfo(int tab, StringBuffer buffer, Object info,
			boolean showResolvedInfo) {
		buffer.append(this.tabString(tab));
		buffer.append("<import container>"); //$NON-NLS-1$
		if (info == null) {
			buffer.append(" (not open)"); //$NON-NLS-1$
		}
	}
}
