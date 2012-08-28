/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.core.test.validation;

import org.eclipse.core.runtime.Preferences;

import org.eclipse.vjet.eclipse.core.VjetPlugin;
import org.eclipse.vjet.eclipse.core.test.parser.AbstractVjoModelTests;

/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class DefaultValueTester extends AbstractVjoModelTests {
    public void testDefaultValidation() {
        Preferences store = VjetPlugin.getDefault().getPluginPreferences();
        assertTrue(store
                .isDefault(VjetPlugin.VJETVALIDATION));
        assertTrue(store
                .getBoolean(VjetPlugin.VJETVALIDATION));
    }
}
