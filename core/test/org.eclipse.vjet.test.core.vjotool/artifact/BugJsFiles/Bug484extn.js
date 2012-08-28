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
vjo.ctype('BugJsFiles.Bug484extn')
.needs('BugJsFiles.GenericCtype', 'myAlias')
.props({
        main: function() { //< public void main (String...) 
        	this.vj$.myAlias.RADIUS;
        	var vv = this.vj$.myAlias();//<GenericCtype
        	vv.compute("Test");
        	
        }
}).endType();
