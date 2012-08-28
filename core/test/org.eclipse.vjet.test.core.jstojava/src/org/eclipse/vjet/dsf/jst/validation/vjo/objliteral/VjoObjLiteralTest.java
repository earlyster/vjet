/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jst.validation.vjo.objliteral;





import java.util.List;

import org.eclipse.vjet.dsf.jsgen.shared.ids.MethodProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.ids.TypeProbIds;
import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;
import org.eclipse.vjet.dsf.jst.validation.vjo.VjoValidationBaseTester;
import org.junit.Test;




//@Category( { P1, FAST, UNIT })
//@ModuleInfo(value="DsfPrebuild",subModuleId="JsToJava")
public class VjoObjLiteralTest extends VjoValidationBaseTester {

    List<VjoSemanticProblem> actualProblems = null;

    @Test
    //@Category( { P1, FAST, UNIT })
    //@Description("Test create customed object")
    public void testObjectLiteral() throws Exception {
        expectProblems.clear();
        expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 20, 0));
        expectProblems.add(createNewProblem(MethodProbIds.ParameterMismatch, 22, 0));
        
        actualProblems = getVjoSemanticProblem(
                "org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.",
                "ObjLiteral.js", this.getClass());
        
        assertProblemEquals(expectProblems, actualProblems);
    }
    
    @Test
    //@Category( { P2, FAST, UNIT })
    //@Description("Test create customed object")
    public void testObjectLiteralInternal() throws Exception {
        expectProblems.clear();
        expectProblems.add(createNewProblem(TypeProbIds.IncompatibleTypesInEqualityOperator, 6, 0));
        
        actualProblems = getVjoSemanticProblem(
                "org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.",
                "ObjLiteralInternal.js", this.getClass());
        
        assertProblemEquals(expectProblems, actualProblems);
    }
    
    @Test
    //@Category( { P2, FAST, UNIT })
    //@Description("Test create customed object")
    public void testObjectLiteralAttributed() throws Exception {
        expectProblems.clear();
        
        actualProblems = getVjoSemanticProblem(
                "org.eclipse.vjet.dsf.jst.validation.vjo.objliteral.",
                "ObjLiteralWithAttributedTypes.js", this.getClass());
        
        assertProblemEquals(expectProblems, actualProblems);
    }
}
