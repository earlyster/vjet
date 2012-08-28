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
 *     CSSImportRule has the all the properties and methods of the CSSRule object as well as the properties and methods defined below.
    The CSSImportRule object has the following properties:

        href
            This read-only property is of type String.
        media
            This read-only property is a MediaList object.
        styleSheet
            This read-only property is a CSSStyleSheet object.


 */
@Alias("CSSImportRule")
public interface CssImportRule extends CssRule {

	@Property String getHref();
	
	@Property MediaList getMedia();
	
	@Property CssStyleSheet getStyleSheet();
	
	
	
}
