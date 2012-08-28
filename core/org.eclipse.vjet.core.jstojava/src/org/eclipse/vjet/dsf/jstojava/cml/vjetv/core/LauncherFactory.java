/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.cml.vjetv.core;

import org.eclipse.vjet.dsf.jstojava.cml.vjetv.core.impl.EVHeadlessLauncher;

/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class LauncherFactory {
    
    /**
     * Get vjet headless launcher
     * 
     * @return {@link IHeadLessLauncher}
     */
    public static IHeadLessLauncher getVjetValidationLauncher(){
        return new EVHeadlessLauncher();
    }
}
