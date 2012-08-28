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
/**
 * 
 */
package org.eclipse.dltk.mod.javascript.dom.support;

import java.net.URL;

/**
 * This class is a proposal holder around a function object. So that you can
 * give it a help text and parameter names.
 * 
 * If wrapped in such an object then it is assumed that the object is a function
 * object.
 * 
 * @author jcompagner
 * 
 */
public interface IProposalHolder {
	public char[][] getParameterNames();

	public String getProposalInfo();

	public Object getObject();

	public URL getImageURL();

	public boolean isFunctionRef();
}
