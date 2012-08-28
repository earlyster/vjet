/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsnative.file;

import java.util.Date;

import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 *   interface File : Blob {

      readonly attribute DOMString name;
      readonly attribute Date lastModifiedDate;
};
  
 */
public interface File extends Blob {

	@Property String getName();
	@Property Date getLastModifiedDate();
	
}
