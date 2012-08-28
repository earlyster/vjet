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
package org.eclipse.vjet.dsf.jsnative.events;

import org.eclipse.vjet.dsf.jsnative.Window;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 * 
 // Introduced in DOM Level 3:
 interface CompositionEvent : UIEvent 
 {
 readonly attribute DOMString       data;
 readonly attribute DOMString       locale;

 void                               initCompositionEvent(in DOMString typeArg, 
 in boolean canBubbleArg, 
 in boolean cancelableArg, 
 in AbstractView viewArg, 
 in DOMString dataArg,
 in DOMString localeArg);
 };

 */
@JsMetatype
@DOMSupport(DomLevel.THREE)
public interface CompositionEvent extends UIEvent {

	@Property
	String getData();

	@Property
	String getLocale();

	/**
	 * 
	 * @param eventType
	 *            Required. One of the following values, or a user-defined
	 *            custom event type. compositionend Text input is complete. If
	 *            character data is available, this event is followed by a
	 *            textInput event with the appropriate inputMethod value.
	 *            compositionstart A text input system starts composing a
	 *            passage of text. compositionupdate New characters are added to
	 *            the data attribute. This event is optional depending on the
	 *            input method.
	 * @param canBubble
	 *            One of the following required values: true The event should
	 *            propagate upward. false The event does not propagate upward.
	 * @param canCancel
	 *            One of the following required values: true The default action
	 *            can be canceled. false The default action cannot be canceled.
	 * @param viewArg
	 *            Required. The active window object or null. This value is
	 *            returned in the view attribute of the event.
	 * @param data
	 *            Required. The composition data. This value is returned in the
	 *            data attribute of the event.
	 * @param locale
	 *            Required. The locale name. This value is returned in the
	 *            locale attribute of the event.
	 */
	@Function
	void initCompositionEvent(String eventType, boolean canBubble,
			boolean canCancel, Window viewArg, String data,
			String locale);

}
