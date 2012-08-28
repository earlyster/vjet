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
package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

public interface MediaList {
/*
 *            
 * attribute DOMString        mediaText;
                                        // raises(DOMException) on setting

  readonly attribute unsigned long    length;
  DOMString          item(in unsigned long index);
  void               deleteMedium(in DOMString oldMedium)
                                        raises(DOMException);
  void               appendMedium(in DOMString newMedium)
                                        raises(DOMException);

 */

	@Property String getMediaText();
	@Property long getLength();
	
	@Function long item(long index);
	
	@Function void deleteMedium(String oldMedium);
	
	@Function void appendMedium(String newMedium);
	
   	
}
