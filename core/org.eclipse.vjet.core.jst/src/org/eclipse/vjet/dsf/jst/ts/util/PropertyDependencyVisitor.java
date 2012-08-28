/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.ts.util;

import java.util.List;
import java.util.Map;

import org.eclipse.vjet.dsf.jst.IJstNode;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.term.JstIdentifier;
import org.eclipse.vjet.dsf.jst.traversal.IJstVisitor;
import org.eclipse.vjet.dsf.jst.ts.JstTypeSpaceMgr;
import org.eclipse.vjet.dsf.ts.graph.DependencyNode;
import org.eclipse.vjet.dsf.ts.group.Group;
import org.eclipse.vjet.dsf.ts.property.PropertyName;
import org.eclipse.vjet.dsf.ts.type.TypeName;

/**
 * Sample implementation to collect nodes that depend on JstProperty nodes.
 * 
 * Please note: the code is INCOMPLETE. 
 *
 */
public class PropertyDependencyVisitor extends ADependencyVisitor<PropertyName> implements IJstVisitor {
	
	//
	// Satisfy IJstVisitor
	//
	public void preVisit(IJstNode node){
	}
	
	public boolean visit(IJstNode node){
		if (node instanceof JstIdentifier){
			JstIdentifier identifier = (JstIdentifier)node;
			addDependency(identifier.getJstBinding(), identifier);
		}
		

		return true;
	}
	
	public void endVisit(IJstNode node){
	}
	
	public void postVisit(IJstNode node){
		
	}
	
	//
	// API
	//
	public Map<PropertyName,List<IJstNode>> getPropertyDependencies(){
		return m_dependencies;
	}
	
	//
	// Private
	//
	
	private void addDependency(final IJstNode binding, final IJstNode dependent){
		
		if (binding == null || !(binding instanceof IJstProperty)){
			return;
		}
		
		IJstProperty jstProperty = (IJstProperty)binding;
		String ptyName = jstProperty.getName().getName();
		IJstType ptyOwnerType = binding.getOwnerType();

		if (ptyOwnerType == null || (ptyOwnerType.getProperty(ptyName) == null && ptyOwnerType.getGlobalVar(ptyName)==null)){
			return;
		}
		
		String groupName=null;
		if (ptyOwnerType.getPackage() != null) {
			groupName = ptyOwnerType.getPackage().getGroupName();
		}
		
		// handle empty group name (e.g. native types)	
		if (groupName == null && m_ts != null) { // could be in native group
			Group group = m_ts.getGroup(ptyOwnerType);
			
			if (group != null) {
				groupName = group.getName();
			}
		}
		
		PropertyName name = new PropertyName(new TypeName(
				groupName, 
				ptyOwnerType.getName()), 
				ptyName);
		
		if (m_ts != null) {
			IJstType type = (IJstType)m_ts.getType(name.typeName());
			if (type == null) {
				DependencyNode<IJstType> node = (DependencyNode<IJstType>)m_ts.getUnresolvedNodes().get(ptyOwnerType.getName());
				if (node == null) {
					node = new DependencyNode<IJstType>(ptyOwnerType.getName(), ptyOwnerType, null);
					m_ts.addUnresolvedNode(node);
				}
			}
			else if (JstTypeSpaceMgr.isDefaultLibName(groupName)) {
				addImplicitDependency(dependent, groupName, ptyOwnerType);
			}
		}		
		
		add_if_absent(name, dependent);
	}
}
