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
