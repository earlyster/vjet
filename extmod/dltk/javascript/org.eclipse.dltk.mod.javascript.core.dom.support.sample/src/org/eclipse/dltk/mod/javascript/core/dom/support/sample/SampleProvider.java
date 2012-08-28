/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.mod.javascript.core.dom.support.sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.dltk.mod.javascript.dom.support.IDesignTimeDOMProvider;
import org.eclipse.dltk.mod.javascript.dom.support.IProposalHolder;
import org.eclipse.dltk.mod.core.ISourceModule;
import org.mozilla.mod.javascript.Context;
import org.mozilla.mod.javascript.FunctionObject;
import org.mozilla.mod.javascript.NativeObject;
import org.mozilla.mod.javascript.Scriptable;
import org.mozilla.mod.javascript.ScriptableObject;

public class SampleProvider implements IDesignTimeDOMProvider {

	private static final String FORM_JS = "form.js";
	private static final String SAMPLE_FORM = "Sample Form";
	private static final String TITLE = "title";
	private static final String NAME = "name";
	private static final String FORM = "form";
	private static final String SAY_HELLO = "sayHello";

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
	}

	public Class[] resolveHostObjectClasses(ISourceModule module) {
		// second way to contribute class;
		return new Class[] { OtherHost.class };
	}

	public void sayHello() {
		System.out.println("Say Hello world ");
	}

	public Scriptable resolveTopLevelScope(ISourceModule module) {
		Context.enter();
		ScriptableObject global = new NativeObject();
		NativeObject sampleObject = new NativeObject();
		ScriptableObject.putProperty(global, FORM, sampleObject);
		ScriptableObject.putProperty(sampleObject, NAME, SAMPLE_FORM);
		try {
			// first way to contribute class;
			ScriptableObject.defineClass(global, HelloHost.class);
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ScriptableObject.putProperty(sampleObject, TITLE, SAMPLE_FORM);
		try {
			Member method = SampleProvider.class.getMethod(SAY_HELLO,
					new Class[0]);
			ScriptableObject.putProperty(global, SAY_HELLO, new FunctionObject(
					SAY_HELLO, method, global));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return global;
	}

	public boolean canResolve(ISourceModule module) {
		return module.getElementName().endsWith(FORM_JS);
	}

	/**
	 * @see org.eclipse.dlkt.javascript.dom.support.IDesignTimeDOMProvider#filter(org.mozilla.javascript.Scriptable, java.lang.Object[])
	 */
	public Object[] resolveIds(Scriptable scope, String key)
	{
		return null;
	}

	/**
	 * @see org.eclipse.dlkt.javascript.dom.support.IDesignTimeDOMProvider#getProposal(org.mozilla.javascript.Scriptable, java.lang.String)
	 */
	public IProposalHolder getProposal(Scriptable scope, String key)
	{
		return null;
	}
}
