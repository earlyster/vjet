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
vjo.ctype("org.jquery.jQuery")
.globals({
	/**
	 * $ entry point doc
	 */
	$:undefined, //< jQuery:$
	/**
	 * jquery property
	 */
	jQuery:undefined, //< type::jQuery
	/**
	 * JQuery property for testing
	 */
	myJQueryGlobalProp:10,
	/**
	 * JQuery function for testing
	 */
	myJQueryGlobalFunc:function(){}
	
})
.endType()