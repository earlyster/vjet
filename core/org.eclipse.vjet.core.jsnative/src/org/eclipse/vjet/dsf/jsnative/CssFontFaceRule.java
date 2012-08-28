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

/*
 *     CSSFontFaceRule has the all the properties and methods of the CSSRule object as well as the properties and methods defined below.
 The CSSFontFaceRule object has the following properties:

 style
 This read-only property is a CSSStyleDeclaration object.


 *
 */
@Alias("CSSFontFaceRule")
public interface CssFontFaceRule extends CssRule {

	@Property CssStyleDeclaration getStyle();
	
}
