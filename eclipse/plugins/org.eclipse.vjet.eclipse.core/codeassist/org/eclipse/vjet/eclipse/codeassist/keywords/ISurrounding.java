/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.eclipse.codeassist.keywords;

import java.util.List;

public interface ISurrounding {

	/**
	 * Gets keywords that can be surrounded with this keyword. 
	 * @return keywords that can be surrounded with this keyword.
	 */
	List<IVjoCompletionData> getAllowedSurroundedKeywords();
	
}
