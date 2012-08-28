/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.internal.launching;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.mod.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.mod.launching.IInterpreterInstallType;
import org.eclipse.dltk.mod.launching.IInterpreterRunner;

import org.eclipse.vjet.eclipse.core.VjoNature;

public class GenericVjetInstall extends AbstractInterpreterInstall{

	public GenericVjetInstall(IInterpreterInstallType type, String id){
		super(type, id);
	}
	
	public String getNatureId() {
		return VjoNature.NATURE_ID;
	}

	public IInterpreterRunner getInterpreterRunner(String mode) {
		
		IInterpreterRunner runner = super.getInterpreterRunner(mode);

		if (runner != null) {
			return runner;
		}

		if (mode.equals(ILaunchManager.RUN_MODE)) {
			return new VjetInterpreterRunner(this, ILaunchManager.RUN_MODE);
		}

		return null;
	}
	
}
