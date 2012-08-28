/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.override;

import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.override.construct.SyntaxConstructOverride1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.override.construct.SyntaxConstructOverride2Tester;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({
    SyntaxConstructOverride1Tester.class,
    SyntaxConstructOverride2Tester.class,
    SyntaxOverride1Tester.class,
    SyntaxOverride2Tester.class,
    SyntaxOverrideCorrectTester.class
    
})
/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class AllSyntaxTester {

}
