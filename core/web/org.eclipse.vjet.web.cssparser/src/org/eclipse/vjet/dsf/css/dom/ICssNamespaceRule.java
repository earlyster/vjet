/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.css.dom;

import org.w3c.dom.DOMException;

/**
 * 
 */
public interface ICssNamespaceRule extends ICssRule {
    String getPrefix();
    String getNamespace() ;
    ICssCharsetRule setPrefix(String prefix) throws DOMException;
    ICssCharsetRule setNamespace(String namespace) throws DOMException;
}

