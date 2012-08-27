/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.common.statistics;

import org.eclipse.vjet.dsf.dom.DElement;

public interface IV4Statistics {
		
		String getName();
		
		DElement toXml();
		
		String asString();
		
		void reset();
}
