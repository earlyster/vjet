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
package org.eclipse.dltk.mod.javascript.dom.support.internal;

import org.eclipse.dltk.mod.internal.javascript.reference.resolvers.IReferenceResolver;
import org.eclipse.dltk.mod.internal.javascript.reference.resolvers.IResolverFactory;

public class DomResolverFactory implements IResolverFactory {

	public IReferenceResolver create() {
		return new DOMResolver();
	}

}
