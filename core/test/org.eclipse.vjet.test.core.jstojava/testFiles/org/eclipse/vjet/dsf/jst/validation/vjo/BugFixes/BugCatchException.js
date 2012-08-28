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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugCatchException')
.props({

	scopedEx: function(){
		try{
			alert('nothing');
		}
		catch(E){
			alert(E.name);
			alert(E.message);
		}
		catch(E){
			alert(E.name);
			alert(E.message);
		}
	},
	
	//> public boolean missingRtn()
	missingRtn: function(){
		try{
			alert('nothing');
		}
		catch(E){
			return false;
		}
	},
	
	//> public boolean correctRtn()
	correctRtn: function(){
		try{
			alert('nothing');
		}
		catch(E){
			return false;
		}
		
		return true;
	},
	
	//> public boolean forceRtnInFinally()
	forceRtnInFinally: function(){
		try{
			alert('nothing');
		}
		catch(E){
			return false;
		}
		finally{
			return true;
		}
	}

}).endType();