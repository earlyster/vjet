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
vjo.ctype('bugs.b3238.Bug3238')
.protos({
        age: 0, //<int
        name: null, //<String
        address: null, //<String
        //>public void constructs(int name, int age, String address)
        constructs: function(name, age, address) {
                this.age = age;
                this.name= name;
                this.address = address;
		}
}).endType()