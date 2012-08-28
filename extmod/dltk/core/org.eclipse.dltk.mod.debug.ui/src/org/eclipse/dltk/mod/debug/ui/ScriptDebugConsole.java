/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.mod.debug.ui;

import org.eclipse.debug.core.ILaunch;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.IOConsole;

public class ScriptDebugConsole extends IOConsole {
	private ILaunch launch;

	public ILaunch getLaunch() {
		return launch;
	}

	public void setLaunch(ILaunch launch) {
		this.launch = launch;
	}

	public ScriptDebugConsole(String name, ImageDescriptor imageDescriptor,
			String encoding) {
		super(name, null, imageDescriptor, encoding, true);

		this.addPatternMatchListener(new ScriptDebugConsoleTraceTracker());
	}

	public void matcherFinished() {
		super.matcherFinished();
	}

	public void partitionerFinished() {
		super.partitionerFinished();
	}

}
