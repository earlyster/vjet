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


@DOMSupport(DomLevel.ONE)
@JsMetatype
public interface StyleSheetList extends IWillBeScriptable {
	
	/**
	 * Returns the indexth item in the collection. If index is greater
	 * than or equal to the number of nodes in the list, this returns <code>null</code>. 
	 * @param index int Index into the collection
	 * @return Node The node at the indexth position in the NodeList,
	 * or <code>null</code> if that is not a valid index.
	 */
	@Function StyleSheet item(int index);

    /**
     * Retruns The number of nodes in the list. 
     * The range of valid child node indices is 0 to length-1 inclusive.
     * @return int
     */
	@Property int getLength();
	
	@BrowserSupport(BrowserType.IE_6P)
	@Function BehaviorUrnsCollection urns(String sUrn);
	
	/**
     * Only for Rhino support
     * @param type
     * @return
     */
	@BrowserSupport({BrowserType.RHINO_1P})
    @Function Object valueOf(String type);

}
