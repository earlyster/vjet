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
package org.eclipse.dltk.mod.javascript.internal.debug.ui.preferences;

import org.eclipse.osgi.util.NLS;

public class JavaScriptDebugPreferenceMessages extends NLS
{
   private static String BUNDLE_NAME = "org.eclipse.dltk.mod.javascript.internal.debug.ui.preferences.JavaScriptDebugPreferenceMessages";
    
    static {
        NLS.initializeMessages(BUNDLE_NAME, JavaScriptDebugPreferenceMessages.class);
    }

    public static String JavaScriptDebugPreferencePage_description;
    public static String JavaScriptDebugEnginePreferencePage_description;
}
