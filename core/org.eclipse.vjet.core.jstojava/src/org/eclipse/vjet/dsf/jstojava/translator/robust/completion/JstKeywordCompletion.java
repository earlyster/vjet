/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.translator.robust.completion;

import org.eclipse.vjet.dsf.jst.BaseJstNode;

public class JstKeywordCompletion extends JstCompletion {

	
	private static final long serialVersionUID = 1L;

	@Override
	public String getIncompletePart() {
		return getToken();
	}

	public JstKeywordCompletion(BaseJstNode parent, String[] completions) {
		super(parent, completions);
	}

}
