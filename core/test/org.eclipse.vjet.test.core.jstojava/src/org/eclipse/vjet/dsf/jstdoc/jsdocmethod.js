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
/*> public;
 * 
 * type comment
 * 
*/
vjo.ctype("jsdocmethod")
.props({
	/**> public void doIt(); 
	 * 
	 * static method
	 */
	doIt:function(){},
	/**> Number ;
	 * 
	 * static property
	 */
	myprop:10
})
.protos({
	/**> public void doIt(); 
	 * 
	 * instance method
	 */
	doIt:function(){},
	/**> Number ;
	 * 
	 * instance property
	 */
	myprop:10
})
.endType();
