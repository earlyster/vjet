/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.overload;

import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.overload.construct.ConstructorOverload1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.overload.construct.ConstructorOverloadCorrect1Tester;
import org.eclipse.vjet.dsf.jst.validation.vjo.syntax.method.overload.construct.ConstructorOverloadCorrect2Tester;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    MethodOverload1Tester.class,
    MethodOverload2Tester.class,
    MethodOverloadCorrect1Tester.class,
    MethodOverloadCorrect2Tester.class,
    
    ConstructorOverloadCorrect1Tester.class,
    ConstructorOverloadCorrect2Tester.class,
    ConstructorOverload1Tester.class,
    MethodArgumentsTester.class
   
})

/**
 * All method overload testers
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class AllMethodOverloadTesters {

}
