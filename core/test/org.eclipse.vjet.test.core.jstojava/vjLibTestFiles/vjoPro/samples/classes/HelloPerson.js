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
vjo.ctype('vjoPro.samples.classes.HelloPerson') //< public
.needs('vjoPro.samples.classes.Person')
.props({
/**
* @return boolean
* @access public
*/
//> public boolean helloPerson()
helloPerson:function(){
var person1 = new vjoPro.samples.classes.Person();
person1.setName("John");
alert("Hello " + person1.getName());
return false;
}
})
.endType();
