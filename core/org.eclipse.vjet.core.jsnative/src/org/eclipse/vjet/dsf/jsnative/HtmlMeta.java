/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/**
 * http://www.w3.org/TR/REC-html40/struct/global.html#edef-META
 */
@Alias("HTMLMetaElement")
@DOMSupport(DomLevel.ONE)
@JsMetatype
public interface HtmlMeta extends HtmlElement {
	
	@Property String getContent();

	@Property String getHttpEquiv();

	@Property String getName();

	@Property String getScheme();

	@Property void setContent(String content);

	@Property void setHttpEquiv(String httpEquiv);

	@Property void setName(String name);

	@Property void setScheme(String scheme);

}
