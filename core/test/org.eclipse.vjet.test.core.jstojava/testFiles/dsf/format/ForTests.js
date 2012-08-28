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
vjo.ctype("dsf.format.ForTests")
.inherits("dsf.jslang.feature.tests.BaseTest")
.protos({

test: function(){

var foo = 0;//<int
for ( foo = 0; foo < 10; foo++ ) {
}

for ( var bar = 0; bar < 10; bar++ ) {
}
}

}).endType()
