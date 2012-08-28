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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.with_.With2') //< public
.protos({
    //> Number giveNumber(Number myNumber)
    giveNumber:function(myNumber){
		with(this){
			return 10;
		}
    },
    
    //> Number giveNumber1(Number myNumber)
    giveNumber1:function(myNumber){
		with(this){
			return "";
		}
    },
    
    //> String giveNumber2(Number myNumber)
    giveNumber2:function(myNumber){
		with(this){
			return 3;
		}
    }
    
})
.props({
})
.endType();