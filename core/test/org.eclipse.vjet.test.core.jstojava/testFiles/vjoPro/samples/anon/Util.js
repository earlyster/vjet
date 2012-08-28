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
vjo.ctype('vjoPro.samples.anon.Util')
.props({
//> public String doIt()
doIt : function(args)
{
return 'Util - doIt';
}
})
.protos({

value : 'Util', //< public String

//public void contructs(String val)
constructs : function(val)
{
this.value = val;
},

//> public String getVal()
getVal:function()
{
return this.value;
}
})
.endType();
