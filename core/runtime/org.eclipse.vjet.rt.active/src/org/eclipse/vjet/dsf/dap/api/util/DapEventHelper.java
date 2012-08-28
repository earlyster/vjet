/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.dap.api.util;

import org.eclipse.vjet.dsf.active.dom.html.AHtmlElement;
import org.eclipse.vjet.dsf.active.dom.html.AHtmlType;
import org.eclipse.vjet.dsf.active.dom.html.ANode;
import org.eclipse.vjet.dsf.dap.rt.JsBase;
import org.eclipse.vjet.dsf.jsnative.HtmlElement;
import org.eclipse.vjet.dsf.jsnative.HtmlInput;
import org.eclipse.vjet.dsf.jsnative.HtmlSelect;
import org.eclipse.vjet.dsf.jsnative.HtmlTextArea;
import org.eclipse.vjet.dsf.jsnative.Node;
import org.eclipse.vjet.dsf.jsnative.events.Event;
import org.eclipse.vjet.dsf.jsnative.events.EventTarget;
import org.eclipse.vjet.dsf.jsnative.events.KeyboardEvent;

public class DapEventHelper extends JsBase {

	//
	// Singleton
	//
	private static final DapEventHelper s_instance = new DapEventHelper();
	private DapEventHelper(){}
	public static DapEventHelper getInstance(){
		return s_instance;
	}
	
	//
	// API
	//
	public String getSrcId(Event event){
		EventTarget target = event.getTarget(); 
		if (target instanceof AHtmlElement){
			return ((AHtmlElement)target).getId();
		}
		return null;
	}

	public Node getSrcNode(Event event){
		EventTarget target = event.getTarget(); 
		ANode aNode = null;
		if (target instanceof AHtmlElement){
			aNode = ((AHtmlElement)target);
		}
		return aNode;
	}
	
	public HtmlElement getSrcElement(Event event){
		EventTarget target = event.getTarget(); 
		HtmlElement e = null;
		if (target instanceof AHtmlElement){
			e = ((HtmlElement)target);
		}
		return e;
	}
	
	public <T extends HtmlElement> T getSrcElement(Event event, AHtmlType<T> elementType){
		EventTarget target = event.getTarget(); 
		HtmlElement e = null;
		if (target instanceof HtmlElement){
			return (T)target;
		}
		return null;
	}
	
	public String getValue(Event event){
		if (event == null){
			return null;
		}
		EventTarget src = event.getTarget();
		if (src instanceof HtmlInput){
			return ((HtmlInput)src).getValue();
		}
		else if (src instanceof HtmlTextArea){
			return ((HtmlTextArea)src).getValue();
		}
		else if (src instanceof HtmlSelect){
			return ((HtmlSelect)src).getValue();
		}
		return null;
	}
	
	public int getKeyCode(Event event){
		if (event == null){
			return -1;
		}
		if (event instanceof KeyboardEvent){
			return ((KeyboardEvent)event).getKeyCode();
		}
		else {
			return -1;
		}
	}
}
