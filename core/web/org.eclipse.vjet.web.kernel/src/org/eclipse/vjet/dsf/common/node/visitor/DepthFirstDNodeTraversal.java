/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.node.visitor;

import org.eclipse.vjet.dsf.common.phase.PhaseId;
import org.eclipse.vjet.dsf.dom.DNode;
/**
 * Provides a post-order (depth-first) traversal.
 * 
 * @see IDNodeHandlingStrategy
 */
public class DepthFirstDNodeTraversal implements IDNodeHandlingStrategy {
		
	private PhaseId m_phaseId = PhaseId.ANY_PHASE;
	
	public PhaseId getApplicablePhaseId() {
		return m_phaseId;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void setApplicablePhaseId(final PhaseId phaseId) {
		m_phaseId = phaseId;
	}
		
	public void handle(
		final DNode node,
		final IDNodeVisitor visitor)
	{	
		DNodeVisitStatus status = visitor.preVisit(node);
		
		if (status != DNodeVisitStatus.ABORT_SUBTREE &&
			status != DNodeVisitStatus.STOP_SUBTREE_TRAVERSAL)
		{	
			traverse(node, visitor);
		}
		if (status != DNodeVisitStatus.ABORT_CURRENT_NODE ||
			status != DNodeVisitStatus.ABORT_SUBTREE)
		{
			status = visitor.visit(node);
		}
		if (status != DNodeVisitStatus.ABORT_CURRENT_NODE ||
			status != DNodeVisitStatus.ABORT_SUBTREE)
		{
			visitor.postVisit(node);
		}		
	}
	
	protected void traverse(final DNode node, final IDNodeVisitor visitor){
		TraversalUtil.traverseChildrenOnly(node, visitor) ;
		TraversalUtil.traverseFacetsOnly(node, visitor) ;
	}
}
