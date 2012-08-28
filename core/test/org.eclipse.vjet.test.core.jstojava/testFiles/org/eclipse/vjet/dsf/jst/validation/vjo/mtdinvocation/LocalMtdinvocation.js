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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.mtdinvocation.LocalMtdinvocation')
.props({
	b:function(){//<public void b()
		var f;//<void function(int)
		f(100);
		f("wrong");
		
		function g(i){//<void function(int)
			
		}
		
		g(100);
		g("wrong");
		
		//>void function(Date)
		function g2(i){
			
		}
		
		g2(new Date());
		g2("wrong");
		
		f = g;
		f = g2;
		
		//>void function(int)
		var h = function(i){
			
		};
		
		f = h;
	}
})
.endType();