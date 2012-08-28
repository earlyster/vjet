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
vjo.ctype('multipledocmixed') //< public
.props({

	/**
	 * <p>
	 * doIt Js doc
	 * </p>
	 * <code>
	 * mytypes.mytypelib.doIt("foobar");<br>
	 * mytypes.mytypelib.doIt(new Date());<br>
	 * mytypes.mytypelib.doIt();<br>
	 * </code>
	 * 
	 * 
	 * @author jearly@ebay.com
	 */
		
	//> public void doIt(String);test1
	//> public boolean doIt(Date?);test2
	doIt:function(){
	},
	/*> public void foobar(String); 
	 * 
	 * doIt2 Js doc
	 * 
	 * @author syogi@ebay.com
	 * 
	 * 
	 */
	foobar:function(arg){
		
		 
	},
	// internal documentation
	// my comment
	 /*
	  * 
	  */
	//> public void doIt3(Number)
	doIt3:function(){
	
	}
})
.inits(function(){
	this.doIt("");
	this.foobar("");
	this.doIt(new Date());
	
})
.endType();