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
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

@Alias("CSSMediaRule")
public interface CssMediaRule extends CssRule {

	@Property
	MediaList getMedia();

	@Property
	// TODO add variant array
	CSSRuleList getCssRules();

	/**
	 * This method has no return value. The index parameter is of type Number.
	 * This method can raise a DOMException object.
	 * 
	 * @param index
	 */
	@Function
	void deleteRule(int index);

	/**
	 * This method returns a Number. The rule parameter is of type String. The
	 * index parameter is of type Number. This method can raise a DOMException
	 * object.
	 */
	@Function
	int insertRule(String rule, int index);

}
