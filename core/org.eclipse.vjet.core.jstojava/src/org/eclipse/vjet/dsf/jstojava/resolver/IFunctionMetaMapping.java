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
package org.eclipse.vjet.dsf.jstojava.resolver;

import java.util.Set;

public interface IFunctionMetaMapping {

	String[] getGroupIds();

	boolean hasMetaExtension(String targetFunc);

	IMetaExtension getExtension(String targetFunc, String key);

	IMetaExtension getExtentedArgBinding(String targetFunc,
			String key);

	Set<String> getSupportedTargetFuncs();

	boolean isFirstArgumentType(String targetFunc);

}