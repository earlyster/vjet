/*******************************************************************************
 * Copyright (c) 2005, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.internal.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.dltk.mod.core.ICallHierarchyFactory;
import org.eclipse.dltk.mod.core.ICallProcessor;
import org.eclipse.dltk.mod.core.ICalleeProcessor;
import org.eclipse.dltk.mod.core.IMethod;
import org.eclipse.dltk.mod.core.search.IDLTKSearchScope;
import org.eclipse.dltk.mod.javascript.internal.core.codeassist.JavaScriptCallProcessor;
import org.eclipse.dltk.mod.javascript.internal.core.codeassist.JavaScriptCalleeProcessor;

public class JavaScriptCallHierarchyFactory implements ICallHierarchyFactory {
	public ICalleeProcessor createCalleeProcessor(IMethod method,
			IProgressMonitor monitor, IDLTKSearchScope scope) {
		return new JavaScriptCalleeProcessor(method,monitor,scope);
	}

	public ICallProcessor createCallProcessor() {
		return new JavaScriptCallProcessor();
	}

}
