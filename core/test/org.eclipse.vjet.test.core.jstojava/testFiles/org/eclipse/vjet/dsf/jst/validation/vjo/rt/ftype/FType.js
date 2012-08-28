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
vjo.ftype("org.eclipse.vjet.dsf.jst.validation.vjo.rt.ftype.FType")
.props({
	_invoke_: function(d){//< int _invoke_(Date)
		this.refs ++; //should result in an error as undefined field
		return 0;
	},
	
	refs: 0 //< public int
	,
	
	ref: function(){ //< public void ref()
		this.refs ++;
	}
})
.endType();