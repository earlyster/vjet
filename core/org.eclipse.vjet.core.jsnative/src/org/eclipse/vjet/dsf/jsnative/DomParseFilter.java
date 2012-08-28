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
 * interface DOMParserFilter {

  // Constants returned by startElement and acceptNode
  const short               FILTER_ACCEPT                  = 1;
  const short               FILTER_REJECT                  = 2;
  const short               FILTER_SKIP                    = 3;
  const short               FILTER_INTERRUPT               = 4;

  unsigned short     startElement(in Element element);
  unsigned short     acceptNode(in Node node);
  readonly attribute unsigned long   whatToShow;
};

 */
@Alias("DOMParseFilter")
@JsMetatype
public interface DomParseFilter extends IWillBeScriptable{

	@Function short startElement(Element element);
	@Function short acceptNode(Node node);
	@Property long getWhatToShow();
	
}
