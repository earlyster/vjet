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
package org.eclipse.vjet.dsf.jstojava.parser;

import java.util.List;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.IScriptProblem;
import org.eclipse.vjet.dsf.jst.IWritableScriptUnit;
import org.eclipse.vjet.dsf.jst.declaration.JstBlock;

public class WorkableScriptUnit implements IWritableScriptUnit {

	private JstBlock m_block;
	private List<JstBlock> m_blockList;
	private IJstType m_type;
	private List<IScriptProblem> m_probs;

	public WorkableScriptUnit(final JstBlock block, final List<JstBlock> blockList,
			final IJstType type, final List<IScriptProblem> probs) {
		m_block =block;
		m_blockList = blockList;
		m_type =type;
		m_probs = probs;
	}

	@Override
	public IJstType getType() {
		return m_type;
	}

	@Override
	public JstBlock getSyntaxRoot() {
		return m_block;
	}

	@Override
	public List<JstBlock> getJstBlockList() {
		return m_blockList;
	}

	@Override
	public IJstNode getNode(int startOffset) {
		return null;
	}

	@Override
	public List<IScriptProblem> getProblems() {
		return m_probs;
	}

	@Override
	public void setType(IJstType type) {
		m_type =type;

	}

	@Override
	public void setSyntaxRoot(JstBlock block) {
		m_block = block;

	}

	@Override
	public void setJstBlockList(List<JstBlock> blocks) {
		m_blockList =blocks;

	}

	@Override
	public void setProblems(List<IScriptProblem> probs) {
		m_probs = probs;
	}

}
