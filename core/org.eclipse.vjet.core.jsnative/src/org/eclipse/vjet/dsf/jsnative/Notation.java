/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.DOMSupport;
import org.eclipse.vjet.dsf.jsnative.anno.DomLevel;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/**
 * This interface represents a notation declared in the DTD. 
 * A notation either declares, by name, the format of an unparsed entity 
 * (see section 4.7  of the XML 1.0 specification [XML 1.0]), 
 * or is used for formal declaration of processing instruction targets 
 * (see section 2.6 of the XML 1.0 specification [XML 1.0]). 
 * The nodeName attribute inherited from Node is set to the declared name of 
 * the notation.
 * <p>The DOM Core does not support editing Notation nodes; they are therefore readonly.
 * <p>A Notation node does not have any parent. 
 *
 */
@DOMSupport(DomLevel.ONE)
@JsMetatype
public interface Notation extends Node {
	
	/**
	 * The public identifier of this notation. 
	 * If the public identifier was not specified, this is null.
	 * @return
	 */
	@DOMSupport(DomLevel.ONE)
	@BrowserSupport({BrowserType.OPERA_9P})
	@Property String getPublicId();

	/**
	 * The system identifier of this notation. 
	 * If the system identifier was not specified, this is null. 
	 * This may be an absolute URI or not.
	 * @return
	 */
	@DOMSupport(DomLevel.ONE)
	@BrowserSupport({BrowserType.OPERA_9P})
	@Property String getSystemId();


}
