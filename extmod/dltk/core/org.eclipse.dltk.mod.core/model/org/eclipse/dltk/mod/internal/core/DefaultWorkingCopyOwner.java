/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.mod.internal.core;

import org.eclipse.dltk.mod.core.IBuffer;
import org.eclipse.dltk.mod.core.ISourceModule;
import org.eclipse.dltk.mod.core.WorkingCopyOwner;


/**
 * A working copy owner that creates internal buffers.
 */
public class DefaultWorkingCopyOwner extends WorkingCopyOwner {
	
	public WorkingCopyOwner primaryBufferProvider;
		
	public static final DefaultWorkingCopyOwner PRIMARY =  new DefaultWorkingCopyOwner();
	
	private DefaultWorkingCopyOwner() {
		// only one instance can be created
	}
	
	/**
	 * @deprecated Marked deprecated as it is using deprecated code
	 */
	public IBuffer createBuffer(ISourceModule workingCopy) {
		if (this.primaryBufferProvider != null) return this.primaryBufferProvider.createBuffer(workingCopy);
		return super.createBuffer(workingCopy);
	}

	public String toString() {
		return "Primary owner"; //$NON-NLS-1$
	}
}
