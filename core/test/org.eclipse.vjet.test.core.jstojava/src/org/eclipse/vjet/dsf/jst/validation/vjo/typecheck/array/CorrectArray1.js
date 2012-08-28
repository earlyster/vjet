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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.array.CorrectArray1')
.props({
	//> public void main(String[] args)
	main:function(args){
		var days = new String[]{"1","2","3"};
		document.writeln('Demonstrating for loop');
		//snippet.forloop.begin
		for(var i in days)
		{
			document.writeln('Day at ' + i + ' is ' ) ;
		}
		//snippet.forloop.end
		
		document.writeln('Demonstrating for each loop');
	}
})
.endType();