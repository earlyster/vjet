package org.eclipse.vjet.dsf.jsnative.events;

import org.eclipse.vjet.dsf.jsnative.DomInput;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 * LSProgressEvent
 * interface LSProgressEvent : events::Event {
  readonly attribute DOMInput        input;
  readonly attribute unsigned long   position;
  readonly attribute unsigned long   totalSize;
};

 */
@JsMetatype
public interface LSProgressEvent extends Event {

	
	@Property DomInput getInput();
	@Property long getPosition();
	@Property long getTotalSize();
	
}
