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
import org.mozilla.mod.javascript.IWillBeScriptable;

@Alias("CSSCharsetRule")
public interface CssCharsetRule extends CssRule, IWillBeScriptable {

	/*
    encoding
    This property is of type String and can raise a DOMException object on setting.
*/
	@Property String getEncoding();

}
