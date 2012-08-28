/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.vjet.eclipse.internal.codeassist.select.translator;

import java.util.HashMap;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.declaration.JstArg;
import org.eclipse.vjet.dsf.jst.declaration.JstArray;
import org.eclipse.vjet.dsf.jst.declaration.JstAttributedType;
import org.eclipse.vjet.dsf.jst.declaration.JstBlock;
import org.eclipse.vjet.dsf.jst.declaration.JstConstructor;
import org.eclipse.vjet.dsf.jst.declaration.JstDefaultConstructor;
import org.eclipse.vjet.dsf.jst.declaration.JstFunctionRefType;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalFunc;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalProp;
import org.eclipse.vjet.dsf.jst.declaration.JstMethod;
import org.eclipse.vjet.dsf.jst.declaration.JstName;
import org.eclipse.vjet.dsf.jst.declaration.JstObjectLiteralType;
import org.eclipse.vjet.dsf.jst.declaration.JstProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstRefType;
import org.eclipse.vjet.dsf.jst.declaration.JstSynthesizedMethod;
import org.eclipse.vjet.dsf.jst.declaration.JstSynthesizedProperty;
import org.eclipse.vjet.dsf.jst.declaration.JstType;
import org.eclipse.vjet.dsf.jst.declaration.JstTypeRefType;
import org.eclipse.vjet.dsf.jst.declaration.JstTypeReference;
import org.eclipse.vjet.dsf.jst.declaration.JstTypeWithArgs;
import org.eclipse.vjet.dsf.jst.declaration.JstVar;
import org.eclipse.vjet.dsf.jst.declaration.JstVars;
import org.eclipse.vjet.dsf.jst.declaration.SynthOlType;
import org.eclipse.vjet.dsf.jst.expr.MtdInvocationExpr;
import org.eclipse.vjet.dsf.jst.meta.JsCommentMetaNode;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;

/**
 * IJstNodeTranslator extension manager
 * 
 * 
 * 
 */
public class JstToDLTKNodeTranslator {
	private static HashMap<Class<? extends IJstNode>, IJstNodeTranslator>	s_translators	= new HashMap<Class<? extends IJstNode>, IJstNodeTranslator>();

	static {
		JstConstructorTranslator jstConstructorTranslator = new JstConstructorTranslator();
		JstTypeTranslator jstTypeTranslator = new JstTypeTranslator();
		JstPropertyTranslator jstPropertyTranslator = new JstPropertyTranslator();
		JstMethodTranslator jstMethodTranslator = new JstMethodTranslator();
		// register translator extensions
		s_translators.put(JstAttributedType.class, new JstAttributedTypeTranslator());
		s_translators.put(JstType.class, jstTypeTranslator);
		s_translators.put(JstTypeWithArgs.class, jstTypeTranslator);
//		s_translators.put(JstAttributedType.class, jstTypeTranslator);
		s_translators.put(JstObjectLiteralType.class, new JstObjectLiteralTypeTranslator());
		s_translators.put(JstFunctionRefType.class, new JstFunctionRefTypeTranslator());
		s_translators.put(JstRefType.class, jstTypeTranslator);
		s_translators.put(JstTypeReference.class,
				new JstTypeReferenceToDLTKTranslator());
		s_translators.put(JstIdentifier.class, new JstIdentifierTranslator());
		s_translators.put(JstProperty.class, jstPropertyTranslator);
		s_translators.put(JstGlobalProp.class, jstPropertyTranslator);
		s_translators.put(JstVars.class, new JstVarsTranslator());
		s_translators.put(JstVar.class, new JstVarTranslator());
		s_translators.put(MtdInvocationExpr.class,
				new MtdInvocationExprTranslator());
		s_translators.put(JstArg.class, new JstArgTranslator());
		s_translators.put(JstMethod.class, jstMethodTranslator);
		s_translators.put(JstSynthesizedMethod.class, jstMethodTranslator);
		s_translators.put(JstGlobalFunc.class, jstMethodTranslator);
		s_translators.put(JstBlock.class, new JstBlockTranslator());
		s_translators.put(JstName.class, new JstNameTranslator());
		s_translators.put(JstTypeRefType.class, new JstTypeRefTypeToDLTKTranslator());
		s_translators.put(JstConstructor.class, jstConstructorTranslator);
		s_translators
				.put(JstDefaultConstructor.class, jstConstructorTranslator);
		s_translators.put(JstSynthesizedProperty.class,
				new JstSynthesizedPropertyToDLTKTranslator());
		
		s_translators.put(JsCommentMetaNode.class,
				new JsCommentMetaNodeTranslator());
		s_translators.put(JstArray.class,
				new JstArrayTranslator());
		// TODO handle this case JstType translator will not work
		s_translators.put(SynthOlType.class,
				new SynthOLTypeToDLTKTranslator());
	}

	/**
	 * static factory, not need constructor
	 */
	private JstToDLTKNodeTranslator() {
	}

	/**
	 * fetch node translator for the given jst node
	 * 
	 * @param jstNode
	 * @return
	 */
	public static IJstNodeTranslator getNodeTranslator(IJstNode jstNode) {
		if (jstNode == null)
			return null;

		IJstNodeTranslator nodeTranslator = s_translators.get(jstNode
				.getClass());
		if (nodeTranslator != null)
			return nodeTranslator;

		return null;
	}

}
