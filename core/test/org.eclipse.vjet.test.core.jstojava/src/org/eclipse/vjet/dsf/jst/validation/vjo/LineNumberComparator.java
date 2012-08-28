/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo;

import java.util.Comparator;

import org.eclipse.vjet.dsf.jsgen.shared.validation.vjo.VjoSemanticProblem;

/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class LineNumberComparator implements Comparator<VjoSemanticProblem>{
    
    int line1 = 0;
    int line2 = 0;
    
    public int compare(VjoSemanticProblem object1, VjoSemanticProblem object2) {
        line1 = object1.getSourceLineNumber();
        line2 = object2.getSourceLineNumber();
        if(line1>line2){
            return 2;
        }else if(line1<line2){
            return -2;
        }
        return 0;
    }
}
