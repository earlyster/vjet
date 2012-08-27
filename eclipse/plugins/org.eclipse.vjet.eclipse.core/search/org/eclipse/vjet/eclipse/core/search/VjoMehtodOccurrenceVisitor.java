/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.ebayopensource.vjet.eclipse.core.search;

import org.ebayopensource.dsf.jst.IJstMethod;
import org.ebayopensource.dsf.jst.IJstNode;
import org.ebayopensource.dsf.jst.declaration.JstName;
import org.ebayopensource.dsf.jst.term.JstIdentifier;
import org.ebayopensource.vjet.eclipse.internal.codeassist.select.JstNodeDLTKElementResolver;

/**
 * Visitor for finding method's occurrences
 * 
 *  Ouyang
 * 
 */
public class VjoMehtodOccurrenceVisitor extends AbstractVjoOccurrenceVisitor {

	/**
	 * 
	 * 
	 * @param searchedJstNode
	 */
	public VjoMehtodOccurrenceVisitor(IJstMethod searchedJstNode) {
		super(searchedJstNode);

		setMatchName(searchedJstNode.getName().getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ebayopensource.vjet.eclipse.core.ts.GenericVisitor#visit(org.ebayopensource.dsf.jst.term.JstIdentifier)
	 */
	@Override
	public void visit(JstIdentifier node) {
		if (!matchName(node.getName())) {
			return;
		}
		checkNode(node, JstNodeDLTKElementResolver.lookupBinding(node));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ebayopensource.vjet.eclipse.core.ts.GenericVisitor#visit(org.ebayopensource.dsf.jst.declaration.JstName)
	 */
	@Override
	public void visit(JstName node) {
		if (!matchName(node.getName())) {
			return;
		}
		checkNode(node, node.getParentNode());
	}

	private void checkNode(IJstNode node, IJstNode checkingNode) {
		if (checkingNode instanceof IJstMethod) {
			if (matchNode(checkingNode)) {
				addMatch(node);
			}
		}
	}

}
