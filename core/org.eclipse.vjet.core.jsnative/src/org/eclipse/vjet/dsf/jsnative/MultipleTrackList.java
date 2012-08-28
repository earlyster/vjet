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

/*
 * interface MultipleTrackList : TrackList {
  boolean isEnabled(in unsigned long index);
  void enable(in unsigned long index);
  void disable(in unsigned long index);
};


 */
public interface MultipleTrackList extends TrackList {

	@Function boolean isEnabled(long index);
	@Function void enable(long index);
	@Function void disable(long index);
	
}
