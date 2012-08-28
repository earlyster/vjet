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
vjo.ctype('bugs.b3273.b3273')
.props({
         main: function() { //< public void main (String ... arguments) 
                        var x = arguments[0];//<String
                        vjo.sysout.println(x);

                        document =
vjo.Parser.parse("<html><body></body></html>");
//                      document =  vjo.Parser.parse("http://www.ebay.com");

                        var div = document.createElement("div"); //<HTMLElement
                         document.insertBefore(div, document.body);

                        div.innerHTML=x;
                        div.id = "foo";
                        vjo.sysout.println(document.getElementById("foo"));

        } 
})
.endType();
