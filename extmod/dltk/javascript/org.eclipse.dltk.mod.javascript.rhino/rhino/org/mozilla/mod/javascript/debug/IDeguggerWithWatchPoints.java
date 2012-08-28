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
package org.mozilla.mod.javascript.debug;

import org.mozilla.mod.javascript.ScriptableObject;

public interface IDeguggerWithWatchPoints extends Debugger {

	public void access(String property, ScriptableObject object);

	public void modification(String property, ScriptableObject object);
}
