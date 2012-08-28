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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.rt.otype.CallbackClient")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.rt.otype.CallbackRegistry")
.props({
	main: function(){
		var r = this.vj$.CallbackRegistry;//<type::CallbackRegistry
		r.registerOnConnect(function(s, i){
			//error usage on purpose to verify the binding is correct
			i.substring(s);
			s.substring(new Date());
		});
		
		r.registerOnDisconnect(function(s, d){
			//error usage on purpose to verify the binding is correct
			d.substring(s);
			s.substring(d);
		});
	}
}).endType();