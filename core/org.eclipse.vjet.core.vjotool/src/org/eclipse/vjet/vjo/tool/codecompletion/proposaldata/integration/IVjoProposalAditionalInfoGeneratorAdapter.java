/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.codecompletion.proposaldata.integration;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstModifiers;

public interface IVjoProposalAditionalInfoGeneratorAdapter {

	String getAdditionalPropesalInfo(IJstNode node);
	
	String getElementBriefDesc(IJstProperty property);
	
	String getElementBriefDesc(IJstMethod method);
	
	String getModifierListStr(JstModifiers jstModifiers);
	
	boolean isBrowserNoneNode(IJstNode node);
}
