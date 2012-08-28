/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.core.sdk;

import java.io.File;

import org.eclipse.vjet.dsf.jst.ts.util.ISdkEnvironment;
import org.eclipse.core.runtime.IStatus;

public class ISdkEnvironmentType {

	public ISdkEnvironment[] getSdkInstalls() {
		// TODO Auto-generated method stub
		return null;
	}

	public IStatus validateInstallLocation(File file) {
		return null;
	}

	public ISdkEnvironment findSdkInstall(String id) {
		return null;
	}

}
