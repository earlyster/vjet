/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.codeassist.keywords;

import java.util.List;

import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstCompletion;
import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstMixinOnTypeCompletion;
import org.eclipse.vjet.eclipse.internal.core.util.Util;
import org.eclipse.dltk.mod.compiler.env.ISourceModule;
import org.eclipse.dltk.mod.core.CompletionProposal;
import org.eclipse.dltk.mod.core.IType;

/**
 * Provides package/type completion proposals inside "mixin" block
 * 
 * 
 */
public class MixinCompletionHandler extends BaseCompletionHandler {
	public void complete(ISourceModule module, int position,
			JstCompletion completion, List<CompletionProposal> list) {
		super.complete(module, position, completion, list);
	}

	public Class getCompletionClass() {
		return JstMixinOnTypeCompletion.class;
	}
	
	@Override
	protected boolean checkType(IType type, IType currentType) {
		IJstType jstType = Util.toJstType(type);
		
		if (jstType == null
				|| !jstType.isMixin()) {
			return false;
		}
		
		return super.checkType(type, currentType);
	}
}
