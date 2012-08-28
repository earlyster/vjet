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

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

@Alias("CSSPageRule")
public interface CssPageRule extends CssRule {

/*    CSSPageRule has the all the properties and methods of the CSSRule object as well as the properties and methods defined below.
    The CSSPageRule object has the following properties:

        selectorText
            This property is of type String and can raise a DOMException object on setting.
        style
            This read-only property is a CSSStyleDeclaration object.
*/
	/**
	 *  This property is of type String and can raise a DOMException object on setting.
	 */
	@Property String getSelectorText();
	
	/**
	 * This read-only property is a CSSStyleDeclaration object.
	 */
	
	@Property CssStyleDeclaration getStyle();
	


}
