package org.eclipse.vjet.dsf.jsnative.events;

import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 * // Introduced in DOM Level 3:
 interface CustomEvent : Event {
 readonly attribute any             detail;
 void                               initCustomEvent(in DOMString typeArg, 
 in boolean   canBubbleArg, 
 in boolean   cancelableArg, 
 in any       detailArg);
 };


 * 
 */
@JsMetatype
@DOMSupport(DomLevel.THREE)
public interface CustomEvent extends Event {

	@Property
	Object getDetail();

	/**
	 * @param eventType
	 *            Required. A user-defined custom event type.
	 * @param canBubble
	 *            One of the following required values: true The event should
	 *            propagate upward. false The event does not propagate upward.
	 * @param canCancel
	 *            One of the following required values: true The default action
	 *            can be canceled. false The default action cannot be canceled.
	 * @param detail
	 *            Required. A user-defined object that can contain additional
	 *            information about the event. This parameter can be null. This
	 *            value is returned in the detail property of the event.
	 */
	@Function
	void initCustomEvent(String eventType, boolean canBubble, boolean canCancel,
			Object detail);

}
