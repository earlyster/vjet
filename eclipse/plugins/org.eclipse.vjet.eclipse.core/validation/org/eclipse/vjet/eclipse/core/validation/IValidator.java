/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.core.validation;

import java.util.List;
import java.util.Set;

import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.IScriptProblem;
import org.eclipse.vjet.dsf.jst.IScriptUnit;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.mod.compiler.problem.DefaultProblem;

public interface IValidator {

	List<DefaultProblem> validate( IJstType jstType)
			throws CoreException;

	List<DefaultProblem> validate( IScriptUnit jstType)
	throws CoreException;

	Set<IResource> deriveResources(Object object);
	
	List<IScriptProblem> doValidate( IJstType jstType);

	List<IScriptProblem> doValidate( IScriptUnit unit);
	
}
