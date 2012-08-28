/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.vjet.dsf.jst.validation.vjo.samples;

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
 * Till OCT.14 only 2 test case fail. 
 */
@RunWith(Suite.class)
@SuiteClasses({
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.auto.client.Autocomplete.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.dupreq.client.AjaxDupRequest.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.dynamicscript.client.AjaxDynamicScriptEx1.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.simple.client.AjaxSampleEx1.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.suggest.client.Suggest.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.ajax.sample.timeout.client.AjaxTimeOut.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.JavaPrimitiveArgs.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.OverloadedMethod.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.PassingProxiedJSMethod.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.VarArgs.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.jsr.VjoJavaBean.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.sample1.base.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.sample1.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.sample1.Employer.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.windows.CloseAnOpenWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FieldFocusExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormAutoClearTextField.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormDropdownAddOptions.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormGetSetAttributes.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormSelectText.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.FormSuppressSubmission.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx41.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx42.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx51.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.HTMLandDomEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImageAnimateImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImageChangeOnClick.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImageChangeOnHover.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImageLoadingFunction.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImagePreloadImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.vjlib.ImageStretchImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.HelloEmployee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.HelloPerson.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxyAbstract.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxyBase.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxyEnum.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxyInterface.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxyMixin.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.JavaProxySample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4javadev.samples.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.foundations.HelloWorld.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.CloseAnOpenWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.CustomPopupWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FieldFocusExample.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FormAutoClearTextField.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FormDropdownAddOptions.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FormGetSetAttributes.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FormSelectText.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.FormSuppressSubmission.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx41.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx42.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx51.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.HTMLandDomEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageAnimateImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageChangeOnClick.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageChangeOnHover.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImagePreloadImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ImageStretchImage.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.OpenConfirmDialog.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.OpenDefaultWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.dox.ebay.vjoPro.vjoPro4jsdev.samples.vjlib.ResizePopupWindow.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.deploymentoptions.jstype.Sample.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.EventHandlerEx10.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.EventHandlerEx1and2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.EventHandlerEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.EventHandlerEx8.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.EventHandlerEx9.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.eventhandler.Sample1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.vjoProtype.stub.HelloDemo.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.vjoProtype.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.vjoProtype.HelloWorld.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.vjoProtype.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.basic.vjoProtype.Printer.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.log.Log.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.HelloEmployee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.HelloPerson.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.HelloWorld.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.Person.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.classes.PersonWithJSDependency.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.cookies.CookieEx7.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.decljs.JsDoc1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.decljs.JsDoc2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.decljs.JsDoc4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx41.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx42.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx51.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.dom.HTMLandDomEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.forms.FormEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.images.Animation.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.images.Image.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.images.ImageEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.images.ImageEx2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.images.ImageEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.jsonly.JsOnlyEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.jsonly.JsOnlyEx2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.jsonly.NoVjoJs.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.Employee.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.Overloading.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx1.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx10.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx11.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx3pt1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx4pt1.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx5.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx6.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx7.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx8.class,
//    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.ServerEx9.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.server.SomeUtil.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenConfirmEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenWindowEx1.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenWindowEx2.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenWindowEx3.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenWindowEx4.class,
    org.eclipse.vjet.dsf.jst.validation.vjo.samples.vjoPro.samples.windows.OpenWindowEx6.class
})
public class AllVjoSamplesTest {
	 @BeforeClass
     public static void beforeClass(){
//     	JstCache.getInstance().clear();
//     	LibManager.getInstance().clear();
     }
	
}
