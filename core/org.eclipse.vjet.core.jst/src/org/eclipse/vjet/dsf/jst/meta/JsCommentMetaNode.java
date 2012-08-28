/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.meta;

import org.eclipse.vjet.dsf.jst.traversal.IJstNodeVisitor;


/**
 * 
 *
 */
public class JsCommentMetaNode 
	extends BaseJsCommentMetaNode<IJsCommentMeta> {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void accept(IJstNodeVisitor visitor){
		visitor.visit(this);
	}
}
