/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.codecompletion.handler;

import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstCompletion;
import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstKeywordCompletion;
import org.eclipse.vjet.vjo.tool.codecompletion.IVjoCcAdvisor;
import org.eclipse.vjet.vjo.tool.codecompletion.IVjoCcHandlerParticipant;
import org.eclipse.vjet.vjo.tool.codecompletion.VjoCcCtx;

public class VjoCcHandlerParticipant implements IVjoCcHandlerParticipant {
	
	
	public boolean accept(VjoCcCtx ctx, IVjoCcAdvisor advisor) {
		JstCompletion completion = ctx.getCompletion();
		if (completion == null) {
			return false;
		}
		if (completion instanceof JstKeywordCompletion) {
			
		}
		return true;
	}

}
