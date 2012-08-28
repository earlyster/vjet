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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.with_.With') //< public
.protos({
	myNumber:10,
	
    //> Number giveNumber(Number myNumber)
    giveNumber:function(myNumber){
        return 10;
    },
    
    //> void b()
	b:function(){
		with(this){
			giveNumber(myNumber);
		}
		with(org.eclipse.vjet.dsf.jst.validation.vjo.with_.With){
			what();
			giveStaticNumber();
		}
	}
})
.props({
    //> Number giveStaticNumber()
	giveStaticNumber: function(){
		return 10;
	}
})
.endType();