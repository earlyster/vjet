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
vjo.ctype('syntax.global.globalType.GlobalError') //< public
.props({
  
})
.protos({
//>public void foo() 
foo : function(){
	alert("dd");
	alert(arguments);
	alert(document);
	alert(form);
	alert(dec);
	alert(new Error());
	alert(new EvalError());
	alert(new RangeError());
	alert(new ReferenceError());
	alert(new SyntaxError());
	alert(new TypeError());
	alert(new URIError());
	alert(new DOMException());
	alert(new EventException());
}
})
.endType();