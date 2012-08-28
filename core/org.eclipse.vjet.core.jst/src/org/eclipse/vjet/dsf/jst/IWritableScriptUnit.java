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
package org.eclipse.vjet.dsf.jst;

import java.util.List;

import org.eclipse.vjet.dsf.jst.declaration.JstBlock;

public interface IWritableScriptUnit extends IScriptUnit {

	void setType(IJstType type);
	void setSyntaxRoot(JstBlock block);
	void setJstBlockList(List<JstBlock> blocks);
	void setProblems(List<IScriptProblem> probs);
	
}
