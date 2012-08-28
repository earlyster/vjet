/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.internal.debug.ui.interpreters;

import org.eclipse.dltk.mod.internal.debug.ui.interpreters.AbstractInterpreterComboBlock;
import org.eclipse.dltk.mod.internal.debug.ui.interpreters.AbstractInterpreterContainerWizardPage;

public class JavaScriptInterpreterContainerWizardPage extends
		AbstractInterpreterContainerWizardPage {

	protected AbstractInterpreterComboBlock getInterpreterBlock() {
		return new JavaScriptInterpreterComboBlock(null);
	}
}
