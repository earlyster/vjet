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
import org.eclipse.vjet.dsf.jsnative.anno.FactoryFunc;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.MType;
import org.eclipse.vjet.dsf.jsnative.anno.OverLoadFunc;
import org.eclipse.vjet.dsf.jsnative.anno.ProxyFunc;
import org.mozilla.mod.javascript.IWillBeScriptable;

/**
 * http://www.w3.org/TR/DOM-Level-2-Events/java-binding.html
 */
@DOMSupport(DomLevel.THREE)
@MType
public interface DocumentEvent extends IWillBeScriptable {
	
	@DOMSupport(DomLevel.TWO)
	@FactoryFunc
	@BrowserSupport({BrowserType.FIREFOX_1P, BrowserType.OPERA_9})
	@Function Event createEvent(String eventType);//throws DOMException;

	@DOMSupport(DomLevel.TWO)
	@FactoryFunc
	@BrowserSupport({BrowserType.IE_6P})
	@OverLoadFunc Event createEventObject(String eventType);//throws DOMException;
	
	@BrowserSupport({BrowserType.IE_6P})
	@OverLoadFunc Event createEventObject();
	
	@BrowserSupport({BrowserType.IE_6P})
	@OverLoadFunc Event createEventObject(Event evt);
	
	@ProxyFunc("createEventObject")
	Event __createEventObject(Object arg1, Object arg2, Object arg3, Object arg4,
			Object arg5);

	
}

