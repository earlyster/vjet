/*******************************************************************************
 * Copyright (c) 2005-2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.core.test.ui;

import org.eclipse.vjet.dsf.jst.ts.JstTypeSpaceMgr;
import org.eclipse.vjet.dsf.jstojava.controller.JstParseController;
import org.eclipse.vjet.eclipse.core.parser.VjoParserToJstAndIType;
import org.eclipse.vjet.eclipse.core.parser.VjoSourceElementResolver;
import org.eclipse.vjet.eclipse.core.ts.VjoJstTypeLoader;
import org.eclipse.vjet.vjo.tool.typespace.TypeSpaceMgr;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 *Add test cases for test type space clean function
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public class TypeSpaceCleanTester extends TestCase {

    /**
     * Add test cases for test type space clean function
     * Purpose: After clean. The default lib should be reloaded.
     */
    public void testTypeSpaceClean() {
        
    	JstParseController controller = VjoParserToJstAndIType.getJstParseController();
        controller.setRefResolver(new VjoSourceElementResolver(controller));
        new JstTypeSpaceMgr(controller, new VjoJstTypeLoader());
        TypeSpaceMgr.getInstance().init(controller);
        TypeSpaceMgr.getInstance().clean();
        Assert.assertEquals(TypeSpaceMgr.getInstance().getTypeSpace()
                .getGroups().keySet().size(), 4);
    }
}
