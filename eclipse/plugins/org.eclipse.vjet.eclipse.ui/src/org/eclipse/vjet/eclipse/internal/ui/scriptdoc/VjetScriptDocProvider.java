/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.internal.ui.scriptdoc;

import java.io.Reader;
import java.io.StringReader;

import org.eclipse.vjet.dsf.jst.IJstGlobalFunc;
import org.eclipse.vjet.dsf.jst.IJstGlobalProp;
import org.eclipse.vjet.dsf.jst.IJstGlobalVar;
import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.vjo.tool.typespace.TypeSpaceMgr;
import org.eclipse.dltk.mod.core.IField;
import org.eclipse.dltk.mod.core.IMember;
import org.eclipse.dltk.mod.core.IMethod;
import org.eclipse.dltk.mod.core.IModelElement;
import org.eclipse.dltk.mod.core.IType;
import org.eclipse.dltk.mod.internal.core.VjoExternalSourceModule;
import org.eclipse.dltk.mod.internal.core.VjoSourceType;
import org.eclipse.dltk.mod.javascript.scriptdoc.JavaDoc2HTMLTextReader;
import org.eclipse.dltk.mod.ui.documentation.IScriptDocumentationProvider;

public class VjetScriptDocProvider implements IScriptDocumentationProvider {

	
	IJstNode m_node;
	

	
	
	public Reader getInfo(IMember element, boolean lookIntoParents,
			boolean lookIntoExternal) {

		String groupName = "";
		String typeName = "";
		if (element instanceof VjoSourceType) {
			VjoSourceType module = (VjoSourceType) element;
			/// need to determine if this is a nested type? utility for this?
			
			groupName = module.getScriptProject().getElementName();
			typeName = module.getFullyQualifiedName(".");
			IJstType t = TypeSpaceMgr.findType(groupName, typeName);
			if (t != null && t.getDoc() != null) {
				return new JavaDoc2HTMLTextReader(new StringReader(t.getDoc()
						.getComment()));
			}
		}

		IType declaringType = element.getDeclaringType();
		if (declaringType == null) {
			return new StringReader("");
		}
		typeName = declaringType.getFullyQualifiedName(".");
		String memberName = element.getElementName();
		if (element.getParent() != null) {
			IModelElement secondLevelParent = element.getParent().getParent();
			if (secondLevelParent instanceof VjoExternalSourceModule) {
				VjoExternalSourceModule module = (VjoExternalSourceModule) secondLevelParent;
				IJstType t = module.getJstType();
				if(element instanceof VjoSourceType){
					if (t != null && t.getDoc() != null) {
						return new JavaDoc2HTMLTextReader(new StringReader(t
								.getDoc().getComment()));
					}
				}else if(element instanceof IField){
					
					IJstProperty property = t.getProperty(element.getElementName());
					
					if (property!=null && property.getDoc()!=null ) {
						return new JavaDoc2HTMLTextReader(new StringReader( property.getDoc().getComment()));
					}
					
				}else if(element instanceof IMethod){
					IJstMethod method = t.getMethod(element.getElementName());
					if (method!=null && method.getDoc()!=null && m_node != method)  {
						m_node = method;
						return new JavaDoc2HTMLTextReader(new StringReader( method.getDoc().getComment()));
					}
				}
			}
		}

		groupName = element.getScriptProject().getElementName();

		if (element instanceof IMethod) {
			IJstType type = TypeSpaceMgr.findType(groupName, typeName);
			if(type==null){
				return new StringReader("");
			}
			IJstMethod m = type.getMethod(memberName);
			if(m==null){
				IJstGlobalVar prop = type.getGlobalVar(memberName);
				if(prop!=null ){
					IJstGlobalFunc gprop = prop.getFunction();
					if (gprop != null && gprop.getDoc() != null) {
						return new JavaDoc2HTMLTextReader(new StringReader(gprop.getDoc()
								.getComment()));
					}
				}
			}
			if (m != null && m.getDoc() != null && m_node==null) {
			
				m_node = m;
				return new JavaDoc2HTMLTextReader(new StringReader(m.getDoc()
						.getComment()));
			}
		} else if (element instanceof IField) {
			IJstType type = TypeSpaceMgr.findType(groupName, typeName);
			IJstProperty p = type.getProperty(memberName);
			if(p ==null){
				IJstGlobalVar prop = type.getGlobalVar(memberName);
				if(prop!=null ){
					IJstGlobalProp gprop = prop.getProperty();
					if (gprop != null && gprop.getDoc() != null) {
						return new JavaDoc2HTMLTextReader(new StringReader(gprop.getDoc()
								.getComment()));
					}
				}
			}
			if (p != null && p.getDoc() != null) {
				return new JavaDoc2HTMLTextReader(new StringReader(p.getDoc()
						.getComment()));
			}

		}
		return new StringReader("");

	}

	
	
	public Reader getInfo(String content) {
		return null;
	}



	@Override
	public void clear() {
		m_node = null;
		
	}

}
