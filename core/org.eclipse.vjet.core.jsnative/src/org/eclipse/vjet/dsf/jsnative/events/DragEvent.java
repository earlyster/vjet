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

import org.eclipse.vjet.dsf.jsnative.anno.Function;


/*
 * interface DragEvent : MouseEvent {
  readonly attribute DataTransfer dataTransfer;

  void initDragEvent(in DOMString typeArg, in boolean canBubbleArg, in boolean cancelableArg, in any dummyArg, in long detailArg, in long screenXArg, in long screenYArg, in long clientXArg, in long clientYArg, in boolean ctrlKeyArg, in boolean altKeyArg, in boolean shiftKeyArg, in boolean metaKeyArg, in unsigned short buttonArg, in EventTarget relatedTargetArg, in DataTransfer dataTransferArg);
};
 */
public interface DragEvent extends MouseEvent {

//	@Property DataTransfer getDataTransfer();
	@Function void initDragEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, Object dummyArg,  long detailArg,  long screenXArg, 
			long screenYArg,  long clientXArg,  long clientYArg, boolean ctrlKeyArg, boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg,  short buttonArg,  EventTarget relatedTargetArg,  DataTransfer dataTransferArg);
	
}
