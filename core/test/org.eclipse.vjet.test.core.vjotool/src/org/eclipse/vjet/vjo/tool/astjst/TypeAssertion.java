/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.astjst;

import java.util.List;

import junit.framework.Assert;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;

public class TypeAssertion implements ICustomAssertion{
	
	@Override
	public void validate(List<IJstNode> testNodes, IJstType rootNode) {
		Assert.assertEquals(1, testNodes.size());
		Assert.assertEquals(true, (testNodes.get(0) instanceof JstIdentifier));
		JstIdentifier node = (JstIdentifier) testNodes.get(0);
		Assert.assertEquals("Object", node.getType().getSimpleName());
				
	}
}
