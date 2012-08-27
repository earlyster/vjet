/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.util;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalFunc;
import org.eclipse.vjet.dsf.jst.declaration.JstGlobalProp;
import org.eclipse.vjet.dsf.jst.declaration.JstInferredType;
import org.eclipse.vjet.dsf.jst.declaration.JstModifiers;
import org.eclipse.vjet.dsf.jst.declaration.JstPackage;
import org.eclipse.vjet.dsf.jst.util.JstTypeHelper;

public class AccessControlUtil {
	
	public static boolean isVisible(final IJstMethod mtd, 
			final IJstType ownerType, 
			final IJstType callerType){
		if(mtd instanceof JstGlobalFunc){
			return true;
		}
		
		if(mtd.isDispatcher()){
			for(IJstMethod overload : mtd.getOverloaded()){
				if(isVisible(overload.getModifiers(), ownerType, callerType)){
					return true;
				}
			}
			return false;
		}
		else{
			return isVisible(mtd.getModifiers(), ownerType, callerType);
		}
	}
	
	public static boolean isVisible(final IJstProperty pty, 
			final IJstType ownerType, 
			final IJstType callerType){
		if(pty instanceof JstGlobalProp){
			return true;
		}
		return isVisible(pty.getModifiers(), ownerType, callerType);
	}
	
	private static boolean isVisible(final JstModifiers modifiers, 
			final IJstType ownerType, 
			final IJstType callerType){
		
		if (!modifiers.isPublic()) {
			
			IJstType fieldOwnerType = ownerType;
			if (fieldOwnerType instanceof JstInferredType.AugmentedType) {
				fieldOwnerType = ((JstInferredType.AugmentedType)fieldOwnerType).getExtend();
			}
			if (fieldOwnerType instanceof JstInferredType) {
				fieldOwnerType = ((JstInferredType)fieldOwnerType).getType();
			}
			
			boolean isVisible = false;
			if (modifiers.isPrivate()) {
				if (callerType == fieldOwnerType || 
					JstTypeHelper.hasSameRootType(callerType, fieldOwnerType)) {
					isVisible = true;
				}
			}
			else if (modifiers.isProtected()){
				if (callerType == fieldOwnerType ||
					JstTypeHelper.isTypeOf(callerType, fieldOwnerType)) {
					isVisible = true;
				}
			}
			else {
				JstPackage callerPackage = JstTypeHelper.getTruePackage(callerType);
				JstPackage fieldOwnerPackage = JstTypeHelper.getTruePackage(fieldOwnerType);
				if (fieldOwnerPackage == null) {
					isVisible = true;
				}
				else if (callerPackage != null) {
					if (callerPackage.getName().equals(fieldOwnerPackage.getName())) {
						isVisible = true;
					}
				}
			}
			return isVisible;
		}
		return true;
	}
}
