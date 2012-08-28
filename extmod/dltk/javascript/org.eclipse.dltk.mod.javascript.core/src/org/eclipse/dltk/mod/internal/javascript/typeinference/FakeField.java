/*******************************************************************************
 * Copyright (c) 2005, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.dltk.mod.internal.javascript.typeinference;

import org.eclipse.dltk.mod.core.ISourceRange;
import org.eclipse.dltk.mod.core.ModelException;
import org.eclipse.dltk.mod.internal.core.ModelElement;
import org.eclipse.dltk.mod.internal.core.SourceField;
import org.eclipse.dltk.mod.internal.core.SourceRange;

public class FakeField extends SourceField {

	private int offset;
	private int length;
	private String snippet;
	private String proposalInfo;

	public FakeField(ModelElement parent, String name, int offset, int length) {
		super(parent, name);
		this.offset = offset;
		this.length = length;
	}

	public ISourceRange getNameRange() throws ModelException {
		return new SourceRange(offset, length);
	}

	public ISourceRange getSourceRange() throws ModelException {
		return new SourceRange(offset, length);
	}

	public String getSnippet() {
		return snippet;
	}

	public void setSnippet(String snippet) {
		this.snippet = snippet;
	}

	/**
	 * @param proposalInfo
	 */
	public void setProposalInfo(String proposalInfo) {
		this.proposalInfo = proposalInfo;

	}

	/**
	 * @return the proposalInfo
	 */
	public String getProposalInfo() {
		return proposalInfo;
	}
}