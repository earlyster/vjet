/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.mixin;

import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
    IMixin.class,
    MMixin.class,
    EMixin.class,
    OMixin.class,
    MixinType1Tester.class,
    MixinType2Tester.class,
    MixinType3Tester.class,
    MixinType4Tester.class,
    MixinTypeCorrect1Tester.class,
    MixINTypeCorrect2Tester.class,
    MixInTypeCorrect3Tester.class,
    MixinTYpeCorrect4Tester.class,
    MixinType5Tester.class,
    MixinType6Tester.class
})
/**
 * All mix in type tester.
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class AllMixinTypeTester extends VjoValidationBaseTester {

}
