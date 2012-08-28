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
vjo.ctype("access.scope.thiskeyword.ThisKeywordSample4")
.props({
	x : undefined, //< public int
	
	//> public int getX()
	getX : function()
	{
		return this.x;
	},

	//> public void main(String[] args)
	main : function(args)
	{
		document.writeln(this.getX());
	}
})
.inits(
	 function(){
	 	this.x = 10;
	 	//or you can use this.vj$.ThisKeywordSample4 instead of this.
		//this.vj$.ThisKeywordSample4.x = 10;
	}
)
.endType();
