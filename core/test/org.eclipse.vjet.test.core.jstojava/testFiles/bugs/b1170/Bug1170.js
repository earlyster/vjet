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
vjo.ctype('bugs.b303.Bug1170')
.props({
        e1 : vjo.etype("boo").values("HA", "BA").endType(),
        e2 : vjo.etype("foo").values("JA", "BLAH").endType(),
        getBob : function(){
                return this.vjo.NamesEnum.BOB;
        },
        e4 : this.vjo.NamesEnum

}).endType()