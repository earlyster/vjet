/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.ebayopensource.vjet.eclipse.internal.ui.wizards;


import java.util.ArrayList;

import org.ebayopensource.vjet.eclipse.core.VjetPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.dltk.mod.core.DLTKCore;
import org.eclipse.dltk.mod.core.IBuildpathEntry;
import org.eclipse.dltk.mod.core.IScriptProject;
import org.eclipse.dltk.mod.internal.ui.dialogs.StatusInfo;
import org.eclipse.dltk.mod.internal.ui.wizards.IBuildpathContainerPage;
import org.eclipse.dltk.mod.internal.ui.wizards.NewWizardMessages;
import org.eclipse.dltk.mod.internal.ui.wizards.dialogfields.DialogField;
import org.eclipse.dltk.mod.internal.ui.wizards.dialogfields.IDialogFieldListener;
import org.eclipse.dltk.mod.internal.ui.wizards.dialogfields.LayoutUtil;
import org.eclipse.dltk.mod.internal.ui.wizards.dialogfields.StringDialogField;
import org.eclipse.dltk.mod.ui.DLTKPluginImages;
import org.eclipse.dltk.mod.ui.wizards.IBuildpathContainerPageExtension;
import org.eclipse.dltk.mod.ui.wizards.NewElementWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;




/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/

/**
  */
public class VJetBrowserBuildPathWizard extends NewElementWizardPage implements IBuildpathContainerPage, IBuildpathContainerPageExtension {

	private StringDialogField fEntryField;
	private ArrayList fUsedPaths;

	/**
	 * Constructor for BuildpathContainerDefaultPage.
	 */
	public VJetBrowserBuildPathWizard() {
		super("VJetDefaultBuildPathWizard"); //$NON-NLS-1$
		setTitle(NewWizardMessages.BuildpathContainerDefaultPage_title); 
		setDescription(NewWizardMessages.BuildpathContainerDefaultPage_description); 
		setImageDescriptor(DLTKPluginImages.DESC_WIZBAN_ADD_LIBRARY);
		
		fUsedPaths= new ArrayList();
		
		fEntryField= new StringDialogField();
		fEntryField.setLabelText(NewWizardMessages.BuildpathContainerDefaultPage_path_label); 
		fEntryField.setDialogFieldListener(new IDialogFieldListener() {
			public void dialogFieldChanged(DialogField field) {
				validatePath();
			}
		});
		validatePath();
	}

	private void validatePath() {
		StatusInfo status= new StatusInfo();
		String str= fEntryField.getText();
		if (str.length() == 0) {
			status.setError(NewWizardMessages.BuildpathContainerDefaultPage_path_error_enterpath); 
		} else if (!Path.ROOT.isValidPath(str)) {
			status.setError(NewWizardMessages.BuildpathContainerDefaultPage_path_error_invalidpath); 
		} else {
			IPath path= new Path(str);
			if (path.segmentCount() == 0) {
				status.setError(NewWizardMessages.BuildpathContainerDefaultPage_path_error_needssegment); 
			} else if (fUsedPaths.contains(path)) {
				status.setError(NewWizardMessages.BuildpathContainerDefaultPage_path_error_alreadyexists); 
			}
		}
		updateStatus(status);
	}

	/* (non-Javadoc)
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite composite= new Composite(parent, SWT.NONE);
		GridLayout layout= new GridLayout();
		layout.numColumns= 1;
		composite.setLayout(layout);
		
		fEntryField.doFillIntoGrid(composite, 2);
		LayoutUtil.setHorizontalGrabbing(fEntryField.getTextControl(null));
		
		fEntryField.setFocus();
		
		setControl(composite);
		Dialog.applyDialogFont(composite);
		if(DLTKCore.DEBUG) {
			System.err.println("BuildpathContainerDefaultPage: add help support"); //$NON-NLS-1$
		}
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IDLTKHelpContextIds.CLASSPATH_CONTAINER_DEFAULT_PAGE);
	}

	/* (non-Javadoc)
	 * @see IBuildpathContainerPage#finish()
	 */
	public boolean finish() {
		return true;
	}
	
	/* (non-Javadoc)
	 * @see IBuildpathContainerPage#getSelection()
	 */
	public IBuildpathEntry getSelection() {
		return DLTKCore.newContainerEntry(new Path(fEntryField.getText()));
	}
		
	public void initialize(IScriptProject project, IBuildpathEntry[] currentEntries) {
		for (int i= 0; i < currentEntries.length; i++) {
			IBuildpathEntry curr= currentEntries[i];
			if (curr.getEntryKind() == IBuildpathEntry.BPE_CONTAINER) {
				fUsedPaths.add(curr.getPath());
			}
		}
	}		

	/* (non-Javadoc)
	 * @see IBuildpathContainerPage#setSelection(IBuildpathEntry)
	 */
	public void setSelection(IBuildpathEntry containerEntry) {
		if (containerEntry != null) {
			fUsedPaths.remove(containerEntry.getPath());
			fEntryField.setText(containerEntry.getPath().toString());
		} else {
			fEntryField.setText(VjetPlugin.BROWSERSDK_ID + "/" + VjetPlugin.BROWSERSDK_LABEL); //$NON-NLS-1$
		}
	}

}
