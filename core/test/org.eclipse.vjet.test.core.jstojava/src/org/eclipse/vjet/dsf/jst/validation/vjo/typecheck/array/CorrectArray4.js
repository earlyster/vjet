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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.CorrectArray4')
.props({
	 //> public void a()
    a:function(){
    	var days = [10, 20, 30, 40] ;  //< List<Integer>(4)

		var days1 = ["10","ewr", "data"] ;  //< ArrayList()

    }
})
.endType();