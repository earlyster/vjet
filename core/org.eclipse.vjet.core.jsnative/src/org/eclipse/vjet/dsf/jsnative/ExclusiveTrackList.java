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

/*
 * interface ExclusiveTrackList : TrackList {
  readonly attribute unsigned long selectedIndex;
  void select(in unsigned long index);
};
 */
public interface ExclusiveTrackList extends TrackList{

	@Property long getSelectedIndex();
	@Function void select(long index);
	
	
}
