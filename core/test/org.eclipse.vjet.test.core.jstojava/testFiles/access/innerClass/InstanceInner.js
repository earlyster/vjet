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
vjo.ctype('access.innerClass.InstanceInner')
.protos({
	InnerClass : vjo.ctype()
	.protos({
		doIt : function()//< void doIt()
		{
			document.writeln('Instance Inner Class doIt Called');
			this.vj$.outer.doIt2();
    		}
    	})
    	.endType(),
    	
    	
    	//> public void voIt2()
    	doIt2 : function()
    	{
			document.writeln('Instance Outer Class doIt Called');
    	}
})
.props({
	//> public void main(String[] args)
	main : function(args){
		var outerType = new access.innerClass.InstanceInner();
		var innerType = new outerType.InnerClass();
		innerType.doIt();
	}
})
.endType();
