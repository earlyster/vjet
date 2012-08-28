/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jstojava.cml.vjetv.model;

import java.util.HashMap;

/**
 * The implement of interface object is execute information. It's the report
 * data which would be used in report function.
 * 
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */
public interface IHeadLessLauncherResult {

    /**
     * This method is used to get report data
     * 
     */
    public HashMap<String,Object> getReportData();

    /**
     * This method is used to get result information which will be show on
     * command line
     * 
     * @return String
     */
    public String getResultInformation();
    
    /**
     * Set result information
     * 
     * @param information {@link String}
     */
    public void setResultInformation(String information);
    
    
    /**
     * Get error problems number
     */
    public int getErrorNumber();
}
