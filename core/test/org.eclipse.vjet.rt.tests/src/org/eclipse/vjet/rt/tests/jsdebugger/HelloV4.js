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
 vjo.ctype("org.eclipse.vjet.rt.tests.jsdebugger.HelloV4")
.props({
    /**      
      * @return boolean
      * @access public
     */
    //> public boolean helloWorld()
     helloWorld:function() {
         var aForm = document.forms["myform"];
         var url = aForm.action;
         url += "/HelloV4";
         aForm.action = url;
         var j = 5;
         j *= 2;
         aForm.abc.value = j;
         aForm.submit();
    }
})
.endType();
