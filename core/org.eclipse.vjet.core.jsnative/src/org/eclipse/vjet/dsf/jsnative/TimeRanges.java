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

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.JsMetatype;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

/*
 * interface TimeRanges {
  readonly attribute unsigned long length;
  double start(in unsigned long index);
  double end(in unsigned long index);
};
 */
@Alias("TimeRanges")
@JsMetatype
public interface TimeRanges extends IWillBeScriptable {

	@Property long getLength();
	@Function double start(long index);
	@Function double end(long index);
}
