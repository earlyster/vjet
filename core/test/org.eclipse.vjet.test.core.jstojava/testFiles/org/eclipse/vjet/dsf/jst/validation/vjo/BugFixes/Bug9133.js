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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug9133")
.needs('vjoPro.dsf.Element')
.props({
	
	//> public void onKeyEnter(Object ev, String elId)
	onKeyEnter : function(ev, elId){
		var el = vjoPro.dsf.Element.get(elId);	//< HTMLElement	
		if(el){
			 if(el.dispatchEvent){
	            var oEvent = document.createEvent("MouseEvents");
	            oEvent.initMouseEvent("click", true, true,window, 1, 1, 1, 1, 1, false, false, false, false, 0, el);
	            el.dispatchEvent(oEvent);
	          }
	        else if(el.fireEvent) { 
	           el.fireEvent("onclick");
	         }
		}
	}
})
.endType();
