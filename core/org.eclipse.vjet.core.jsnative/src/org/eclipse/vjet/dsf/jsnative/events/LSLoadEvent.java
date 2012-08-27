package org.eclipse.vjet.dsf.jsnative.events;

import org.eclipse.vjet.dsf.jsnative.Document;
import org.eclipse.vjet.dsf.jsnative.DomInput;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 * interface LSLoadEvent : events::Event {
  readonly attribute Document        newDocument;
  readonly attribute DOMInput        input;
};
 */
@JsMetatype
public interface LSLoadEvent extends Event {

	@Property Document getNewDocument();
	@Property DomInput getInput();
	
}
