/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
/* 
 * $Id: AllVjoVjLibTester.java, Jul 17, 2009, 1:30:59 AM, liama. Exp$
 *
 * Copyright (c) 2006-2009 Ebay Technologies. All Rights Reserved.
 * This software program and documentation are copyrighted by Ebay 
 * Technologies.
 */
package org.eclipse.vjet.dsf.jst.validation.vjo.vjLib;

import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.eclipse.vjet.vjo.lib.LibManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Class/Interface description
 *
 * @author <a href="mailto:liama@ebay.com">liama</a>
 * @since JDK 1.5
 */

@RunWith(Suite.class)
@SuiteClasses({
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.client.ActiveX.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.client.Browser.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.common.IDedupComparable.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.common.IJsHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.common.IJsReqHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.common.IJsRespHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.common.IJsServiceHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.cookie.VjCookieJar.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Element.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Form.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Frame.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Image.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Positioning.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Select.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Shim.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.document.Text.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.ElementUIx.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Elementx.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Formx.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Framex.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Imagex.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Positioning.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Selectx.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Shim.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.docx.Textx.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.flash.FlashHelper.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.flash.Version.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.service.DedupServiceHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.service.DefaultDedupComparable.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.JSTraceLogConfig.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.PlainFormatter.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.RemoteFormatter.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.Trace.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.TraceLogger.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.jstrace.Wrap.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.ConsoleHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.DefaultConfig.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.Formatter.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.Handler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.Level.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.Logger.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.LogManager.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.LogNode.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.LogRecord.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.MessageHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.RemoteFormatter.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.RemoteHandler.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.RootLogger.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.logging.SimpleFormatter.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.reflection.Reflection.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.xml.XmlHelper.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Ajax.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.AlphaNumeric.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Array.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Bit.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Css.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.CssLoader.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Currency.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Date.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Form.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Frame.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Html.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.JsLoader.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Object.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Popup.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.Timer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.UriBuilder.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.utils.URL.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.window.utils.VjWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.dsf.window.utils.VjWindowUtils.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.BaseComp.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.CompInstanceShortened.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.CompStaticShortened.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.DomUtilities.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.Utilities.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.VjComp.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.VjCompInnerFunction.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.VjOldFunctions.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.vjLib.example.VjStatic.class
})   
public class AllVjoVjLibTester {
    @BeforeClass
    public static void beforeClass(){
//    	JstCache.getInstance().clear();
//    	LibManager.getInstance().clear();
    }
}
