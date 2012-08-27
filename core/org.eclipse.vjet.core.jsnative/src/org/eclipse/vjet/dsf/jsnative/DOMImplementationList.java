/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

/**
 * The DOMImplementationList interface provides the abstraction of an ordered collection 
 * of DOM implementations, without defining or constraining how this collection is implemented. 
 * The items in the DOMImplementationList are accessible via an integral index, starting from 0. 
 *
 */
@DOMSupport(DomLevel.THREE)
@JsMetatype
public interface DOMImplementationList extends IWillBeScriptable {
	
    /**
     * The number of DOMImplementations in the list. 
     * The range of valid child node indices is 0 to length-1 inclusive. 
     * @return
     */
	@BrowserSupport({BrowserType.UNDEFINED})
	@Property int getLength();

    /**
     * Returns the indexth item in the collection. 
     * If index is greater than or equal to the number of DOMImplementations in the list, 
     * this returns null. 
     * @param index
     * @return
     */
	@BrowserSupport({BrowserType.UNDEFINED})
	@Function DOMImplementation item(int index);
}
