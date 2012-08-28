/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.naming;

import org.eclipse.vjet.dsf.common.node.visitor.AbortDNodeTraversalException;
import org.eclipse.vjet.dsf.common.node.visitor.DNodeVisitStatus;
import org.eclipse.vjet.dsf.common.node.visitor.IDNodeHandlingStrategy;
import org.eclipse.vjet.dsf.common.node.visitor.IDNodeVisitor;
import org.eclipse.vjet.dsf.common.node.visitor.PreOrderDNodeTraversal;
import org.eclipse.vjet.dsf.dom.DNode;

abstract class BaseNameCheckerVisitor implements IDNodeVisitor
{
	private final IDNodeHandlingStrategy m_strategy =
		new PreOrderDNodeTraversal();
	protected final DNode m_child;
	protected final DNode m_enclosingScope;
	
	BaseNameCheckerVisitor(
		final DNode child,
		final DNode enclosingScope)
	{
		m_child = child;
		m_enclosingScope = enclosingScope;
	}
	
	public abstract DNodeVisitStatus preVisit(final DNode component)
		throws AbortDNodeTraversalException;
	
	public DNodeVisitStatus visit(final DNode component) {
		return DNodeVisitStatus.CONTINUE;
	}
	
	public DNodeVisitStatus postVisit(final DNode component) {
		return DNodeVisitStatus.CONTINUE;			
	}
	
	public IDNodeHandlingStrategy getStrategy() {
		return m_strategy;
	}
}
