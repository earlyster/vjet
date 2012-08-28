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
vjo.itype('presenter.TestInnerCompletion') //< public
.props({
        InnerStaticCType : vjo.ctype()
        .props({

        })
        .protos({
        	validProp1 : 30, //< int
	        validProp2 : "Test", //< String
	
	        constructs:function(){ //<public constructs()
	                this.validProp2
	                var date = new Date();//<Date
	                date.toString();
	        }
        })
        .endType()
})
.protos ({

})
.endType();
