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
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

/*
 *     The CSSRuleList object has the following properties:

        length
            This read-only property is of type Number.

    The CSSRuleList object has the following methods:

        item(index)
            This method returns a CSSRule object.
            The index parameter is of type Number.
            Note: This object can also be dereferenced using square bracket notation (e.g. obj[1]). Dereferencing with an integer index is equivalent to invoking the item method with that index.


 */

public interface CSSRuleList extends IWillBeScriptable {

	@Property int getLength();
	@Function CssRule item(int index);
	
}
