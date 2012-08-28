/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.core.validation;

import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.IVjoSemanticRuleSet;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.semantic.rules.VjoSemanticRuleRepo;
import org.eclipse.vjet.eclipse.core.VjetPlugin;
import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;

/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class VJetValidationPreferenceInitilizer extends AbstractPreferenceInitializer{

    Preferences corePreference = VjetPlugin.getDefault().getPluginPreferences();
    
    @Override
    public void initializeDefaultPreferences() {
        corePreference.setDefault(VjetPlugin.VJETVALIDATION, true);
        initializeCustomRuleValue();
    }

    private void initializeCustomRuleValue() {
        VjoSemanticRuleRepo ruleRepo = VjoSemanticRuleRepo.getInstance();
        ruleRepo.restoreDefaultPolicies();
        String keyName = "";
        for (IVjoSemanticRuleSet ruleSet : ruleRepo.getRuleSets()) {     
                //Set default value
                keyName = ruleSet.getRuleSetName();
                corePreference.setDefault(keyName, "default");
        }
    }
}
