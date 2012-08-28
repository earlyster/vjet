/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.typecheck.compatibletypes;




import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
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
