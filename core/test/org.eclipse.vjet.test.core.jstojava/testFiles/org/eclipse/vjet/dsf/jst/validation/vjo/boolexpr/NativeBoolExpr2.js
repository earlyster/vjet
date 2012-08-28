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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.boolexpr.NativeBoolExpr2') //< public
.props({
	
	numProperty: 10, //<int
	
	//> public void main(String... arguments)
	main:function(){
		var num = this.numProperty;
		var obj = new this.vj$.NativeBoolExpr2();//<NativeBoolExpr2
		var mix = obj || num;
	},
	
	//> public void testAttrRemoveCallback(MouseEvent e)
    testAttrRemoveCallback:function(e){
        var elem=e.target || window.event.srcElement; 
    }
	

})
.endType();

