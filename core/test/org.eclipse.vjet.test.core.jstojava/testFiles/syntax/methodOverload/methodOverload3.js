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
vjo.ctype('syntax.methodOverload.methodOverload3')
.props({

	//> public void setProject(int project1)
	//> public void setProject(String project1)
	//> public void setProject(String project1, String project2, int intNumber)
	//> public void setProject(String project1, String project2)
	setProject: function(project1, project2, project3) {
	// Implementation Here
	},
	
	//public void init1()
	init1 : function(){
		this.setProject(1);
		this.setProject("String");
		this.setProject("String","String1",30);
		this.setProject("String","string1");
	}
})
.endType();