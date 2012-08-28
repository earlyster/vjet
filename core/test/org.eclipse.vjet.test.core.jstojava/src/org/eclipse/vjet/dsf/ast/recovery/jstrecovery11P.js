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
vjo.ctype('com.ebay.test.validation.FunctionTest') //<public 
.props({
        validStaticProp1 : 20, //< int
        validStaticProp2 : "String", //< String

        main : function(){ //< public void main(String...)
        }
})
.protos({
        validProp1 : 30, //< int
        validProp2 : "Test", //< String

        constructs:function(){ //<public constructs()
                this.validProp2;
                var date = new Date();//<Date
                date.toString();
        }
})
.$missing$
.endType();