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
 * function() { document.writeln('Hello ' + this.i_name); this.test1 = 20; } //
 * Public> String test2 : undefined function2 : function() {
 * document.writeln('Hello ' + this.i_name); this.test1 = 20; } //<public void
 * function2
 * 
 * 3. var x = false; //Public boolean x="String";
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
//@Category( { P3, FAST, UNIT })
public class TypecheckCompartibleType2Tester extends VjoValidationBaseTester {

    @Before
    public void setUp() {
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 12, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 17, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 23, 0));
        expectProblems.add(createNewProblem(TypeProbIds.TypeMismatch, 13, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.ClassBetterStartsWithCapitalLetter, 1, 0));
        expectProblems
                .add(createNewProblem(TypeProbIds.UnusedActiveNeeds, 1, 0));
        expectProblems.add(createNewProblem(
                TypeProbIds.IncompatibleTypesInEqualityOperator, 30, 0));
    }

    @Test
    //@Category( { P3, FAST, UNIT })
    //@Description("Test incomatible situation betwween string and int.Number"
//            + "and unused active needs")
    public void testCompartibleType2() {
        List<VjoSemanticProblem> problems = getVjoSemanticProblem(
                "typecheck.compartible.", "typecheckCompartibleType2.js", this
                        .getClass());
        assertProblemEquals(expectProblems, problems);
    }
}
