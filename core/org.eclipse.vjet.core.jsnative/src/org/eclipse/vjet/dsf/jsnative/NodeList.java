/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
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
import org.eclipse.vjet.dsf.jsnative.anno.Dynamic;
import org.eclipse.vjet.dsf.jsnative.anno.FactoryFunc;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsArray;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

/**
 * The <code>NodeList</code> interface provides the abstraction of an ordered collection of nodes, 
 * without defining or constraining how this collection is implemented. 
 * <code>NodeList</code> objects in the DOM are live.
 *
 */
@DOMSupport(DomLevel.ONE)
@JsMetatype
@Dynamic
public interface NodeList extends IWillBeScriptable {
	
	/**
	 * Returns the indexth item in the collection. If index is greater
	 * than or equal to the number of nodes in the list, this returns <code>null</code>. 
	 * @param index int Index into the collection
	 * @return Node The node at the indexth position in the NodeList,
	 * or <code>null</code> if that is not a valid index.
	 */
	@Function Node item(int index);

    /**
     * Retruns The number of nodes in the list. 
     * The range of valid child node indices is 0 to length-1 inclusive.
     * @return int
     */
	@Property int getLength();
	
	/**
     * Only for Rhino support
     * @param type
     * @return
     */
	@BrowserSupport({BrowserType.RHINO_1P})
    @Function Object valueOf(String type);
	
	/**
	 * Retrieves a collection of objects that have the specified HTML tag name. 
	 * 
	 * @param sTag 	Required. Variant of type String that specifies an HTML tag. It can be any one of the objects exposed by the DHTML Object Model.
	 * @return Returns a collection of element objects if successful, or null otherwise. 
	 * 
	 */
	@BrowserSupport({BrowserType.IE_6P})
	@FactoryFunc
	@JsArray(Node.class)
    @Function NodeList tags(String sTag);
	
	
	

}
