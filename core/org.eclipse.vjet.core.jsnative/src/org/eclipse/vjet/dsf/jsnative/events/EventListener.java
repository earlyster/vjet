/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative.events;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.IType;
import org.mozilla.mod.javascript.IWillBeScriptable;

/**
 * http://www.w3.org/TR/DOM-Level-3-Events/java-binding.html
 */
@DOMSupport(DomLevel.THREE)
@IType
public interface EventListener extends IWillBeScriptable {
	
	@DOMSupport(DomLevel.TWO)
	@BrowserSupport({BrowserType.FIREFOX_1P})
	@Function void handleEvent(Event evt);
}
