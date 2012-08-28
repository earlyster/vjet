/*******************************************************************************
 * Copyright (c) 2005, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.internal.ui.wizards;

import java.util.Observable;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.mod.core.DLTKCore;
import org.eclipse.dltk.mod.core.IModelElement;
import org.eclipse.dltk.mod.javascript.core.JavaScriptNature;
import org.eclipse.dltk.mod.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.mod.javascript.internal.ui.preferences.JavascriptBuildPathsBlock;
import org.eclipse.dltk.mod.javascript.ui.JavaScriptImages;
import org.eclipse.dltk.mod.launching.IInterpreterInstall;
import org.eclipse.dltk.mod.ui.DLTKUIPlugin;
import org.eclipse.dltk.mod.ui.util.BusyIndicatorRunnableContext;
import org.eclipse.dltk.mod.ui.util.IStatusChangeListener;
import org.eclipse.dltk.mod.ui.wizards.BuildpathsBlock;
import org.eclipse.dltk.mod.ui.wizards.NewElementWizard;
import org.eclipse.dltk.mod.ui.wizards.ProjectWizardFirstPage;
import org.eclipse.dltk.mod.ui.wizards.ProjectWizardSecondPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class JavascriptProjectCreationWizard extends NewElementWizard implements
		INewWizard, IExecutableExtension {
	private ProjectWizardFirstPage fFirstPage;
	private ProjectWizardSecondPage fSecondPage;
	private IConfigurationElement fConfigElement;

	public JavascriptProjectCreationWizard() {
		setDefaultPageImageDescriptor(JavaScriptImages.DESC_WIZBAN_PROJECT_CREATION);
		setDialogSettings(DLTKUIPlugin.getDefault().getDialogSettings());
		setWindowTitle(JavascriptWizardMessages.ProjectCreationWizard_title);
	}

	public void addPages() {
		super.addPages();
		fFirstPage = new ProjectWizardFirstPage() {

			JavascriptInterpreterGroup fInterpreterGroup;

			final class JavascriptInterpreterGroup extends
					AbstractInterpreterGroup {

				public JavascriptInterpreterGroup(Composite composite) {
					super(composite);
				}

				protected String getCurrentLanguageNature() {
					return JavaScriptNature.NATURE_ID;
				}
				
				protected String getIntereprtersPreferencePageId() {
					return null;
				} 
			};

			protected void createInterpreterGroup(Composite parent) {
				fInterpreterGroup = new JavascriptInterpreterGroup(parent);
			}

			protected Observable getInterpreterGroupObservable() {
				return fInterpreterGroup;
			}

			protected boolean supportInterpreter() {
				return true;
			}

			protected IInterpreterInstall getInterpreter() {
				return fInterpreterGroup.getSelectedInterpreter();
			}

			protected void handlePossibleInterpreterChange() {
				fInterpreterGroup.handlePossibleInterpreterChange();
			}

			protected boolean interpeterRequired() {
				// TODO Auto-generated method stub
				return false;
			}
		};
		fFirstPage
				.setTitle(JavascriptWizardMessages.ProjectCreationWizardFirstPage_title);
		fFirstPage
				.setDescription(JavascriptWizardMessages.ProjectCreationWizardFirstPage_description);
		addPage(fFirstPage);
		fSecondPage = new ProjectWizardSecondPage(fFirstPage) {
			protected BuildpathsBlock createBuildpathBlock(
					IStatusChangeListener listener) {
				return new JavascriptBuildPathsBlock(
						new BusyIndicatorRunnableContext(), listener, 0,
						useNewSourcePage(), null);
			}

			protected String getScriptNature() {
				return JavaScriptNature.NATURE_ID;
			}

			protected IPreferenceStore getPreferenceStore() {
				return JavaScriptUI.getDefault().getPreferenceStore();
			}
		};
		addPage(fSecondPage);
	}

	protected void finishPage(IProgressMonitor monitor)
			throws InterruptedException, CoreException {
		fSecondPage.performFinish(monitor); // use the full progress monitor
	}

	public boolean performFinish() {
		boolean res = super.performFinish();
		if (res) {
			BasicNewProjectResourceWizard.updatePerspective(fConfigElement);
			selectAndReveal(fSecondPage.getScriptProject().getProject());
		}
		return res;
	}

	/*
	 * Stores the configuration element for the wizard. The config element will
	 * be used in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement cfig,
			String propertyName, Object data) {
		fConfigElement = cfig;
	}

	public boolean performCancel() {
		fSecondPage.performCancel();
		return super.performCancel();
	}

	public IModelElement getCreatedElement() {
		return DLTKCore.create(fFirstPage.getProjectHandle());
	}
}
