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
vjo.ctype('aliasProposal.AliasTest1') //< public
.needs('staticPropAdvisor.StaticPropAdvisorTest','MyAlias1')
.needs('staticPropAdvisor.StaticPropAdvisorTest1')
.needs('nonStaticPropAdvisor.ProtosAdvisorTest')
.props({
  saprop1 : 25,
  saprop2 : "Test"
})
.protos({
	aprop1 : 25,
    aprop2 : "Test",
    
 	//> public constructs ()
	 constructs : function(){
 		var x= new this.vj$.MyAlias1(); //<MyAlias1
 		
 		
 	 } 
})
.endType();