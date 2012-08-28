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
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.unsupported.ThrowCatch')//<public
.protos({
	 foo : function(a ,b){
               var EXCEPTION_DATA = "String exception";
                var e;
                var caught = false;
                try
                {   
                        throw EXCEPTION_DATA;  
                }
                catch (e if true)
                {
                        caught = true;
                        alert(caught);
                }
     },
     
     bar: function(){
     	var exception = "No exception thrown";
        var result = "Failed";
        try {
          var s = new String("Not a Boolean");
        } catch ( e ) {
          result = "Passed!";
          exception = e.toString();
        }
     }
})
.endType();