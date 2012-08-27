/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: TypecheckCompartibleType2Tester.java, May 7, 2009, 6:34:28 PM, liama. Exp$
 *
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay 
 * Technologies.
 */
package org.ebayopensource.dsf.jst.validation.vjo.typecheck.compatibletypes;




import java.util.List;

import org.ebayopensource.dsf.jsgen.shared.ids.TypeProbIds;
import org.ebayopensource.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.ebayopensource.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Before;
import org.junit.Test;




/**
 * test1 : undefined // Public< String //>public void function2 function2 :
 * function() { document.writeln('Hello ' + this.i_name); test1 = 20; no this
 * here }
 *  // Public> String test2 : undefined function2 : function() {
 * document.writeln('Hello ' + this.i_name); test1 = 20; no this here } //<public
 * void function2
 * 
 * 3. var x = false; //Public boolean x="String";
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P3, FAST, UNIT })
public class TypecheckCompartibleType5Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.clear();
        expectProblems.add(createNewProblem(TypeProbIds.TypeMismatch, 10, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 24, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.ClassBetterStartsWithCapitalLetter, 3, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test incomatible situation betwween string and int.Number")
    public void testCompartibleType5() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "typecheck.compartible.", "typecheckCompartibleType5.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}