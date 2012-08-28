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

import org.eclipse.vjet.dsf.jsnative.anno.Property;

public interface StyleSheet {
	/**
	 * readonly attribute DOMString type; attribute boolean disabled; readonly
	 * attribute Node ownerNode; readonly attribute StyleSheet parentStyleSheet;
	 * readonly attribute DOMString href; readonly attribute DOMString title;
	 * readonly attribute MediaList media;
	 */

	/**
	 * This specifies the style sheet language for this style sheet. The style
	 * sheet language is specified as a content type (e.g. "text/css"). The
	 * content type is often specified in the ownerNode. Also see the type
	 * attribute definition for the LINK element in HTML 4.0, and the type
	 * pseudo-attribute for the XML style sheet processing instruction.
	 */
	@Property
	String getType();

	/**
	 * false if the style sheet is applied to the document. true if it is not.
	 * Modifying this attribute may cause a new resolution of style for the
	 * document. A stylesheet only applies if both an appropriate medium
	 * definition is present and the disabled attribute is false. So, if the
	 * media doesn't apply to the current user agent, the disabled attribute is
	 * ignored.
	 */
	@Property
	boolean getDisabled();

	@Property
	Node getOwnerNode();

	@Property
	StyleSheet getParentStyleSheet();

	@Property
	String getHref();

	@Property
	String getTitle();

	@Property
	MediaList getMedia();



}
