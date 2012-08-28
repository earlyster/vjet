/*******************************************************************************
 * Copyright (c) 2005, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.internal.ui.templates;

import org.eclipse.dltk.mod.core.ISourceModule;
import org.eclipse.dltk.mod.ui.templates.ScriptTemplateContext;
import org.eclipse.dltk.mod.ui.templates.ScriptTemplateContextType;
import org.eclipse.jface.text.IDocument;

public class JavaScriptUniversalTemplateContextType extends
		ScriptTemplateContextType {
	
	public static final String CONTEXT_TYPE_ID = "javascriptUniversalTemplateContextType";

	public JavaScriptUniversalTemplateContextType() {
		// empty constructor
	}
	
	public JavaScriptUniversalTemplateContextType(String id) {
		super(id);
	}

	public JavaScriptUniversalTemplateContextType(String id, String name) {
		super(id, name);
	}

	public ScriptTemplateContext createContext(IDocument document, int offset,
			int length, ISourceModule sourceModule) {
		return new JavaScriptTemplateContext(this, document, offset, length,
				sourceModule);
	}
}
