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
vjo.ctype('syntax.methodOverload.methodOverload2')
.props({

	//> public void setProject()
	//> public void setProject(int project)
	//> public void setProject(String project)
	setProject: function(project) {
	// Implementation Here
	},
	
	//public void init1()
	init1 : function(){
		this.setProject(1);
	},
		
	//public void init2()
	init2 : function(){
		this.setProject("HA");
		this.setProject(true);
		this.setProject(23.09);
	}
})
.endType();