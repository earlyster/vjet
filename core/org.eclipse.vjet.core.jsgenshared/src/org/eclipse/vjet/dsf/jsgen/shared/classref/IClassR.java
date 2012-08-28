/*******************************************************************************
 * Copyright (c) 2005, 2012 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.jsgen.shared.classref;



/**
 * The body of this file should not be manually edited.
 * Please update IClassReferenceSrc, then following its instruction
 * to update this file.
 */
public interface IClassR {
    String JsNativeNodeName = "org.eclipse.vjet.dsf.jsnative.Node";
    String HtmlElementName = "org.eclipse.vjet.dsf.jsnative.HtmlElement";
    String VJJsxHelperName = "org.eclipse.vjet.dsf.dap.api.util.VJJsxHelper";
    String VJJsxHelperSimpleName = "org.eclipse.vjet.dsf.dap.api.util.VJJsxHelper";
    String IJsConstructor = "org.eclipse.vjet.dsf.resource.pattern.js.IJsConstructor";
    String IJsParamGenerator = "org.eclipse.vjet.dsf.resource.pattern.js.IJsParamGenerator";
    String StringBuilder = "java.lang.StringBuilder";
    String EventType = "org.eclipse.vjet.dsf.html.events.EventType";
    String CodeGenerated = "org.eclipse.vjet.dsf.util.CodeGenerated";
    String CodeGeneratedSimpleName = "CodeGenerated";
    String JsObj = "org.eclipse.vjet.dsf.aggregator.jsref.JsObj";
    String JsEnum = "org.eclipse.vjet.dsf.aggregator.jsref.JsEnum";
    String JsVjoObject = "vjo.ObjectJsr";
    String JsVjoClass = "vjo.ClassJsr";
    String JsObjData = "org.eclipse.vjet.dsf.aggregator.jsref.JsObjData";
    String IJsObjectRef = "org.eclipse.vjet.dsf.html.js.IJsObjectRef";
    String JsRuntimeCtx = "org.eclipse.vjet.dsf.jsruntime.context.JsRuntimeCtx";
    String ISimpleJsEventHandler = "org.eclipse.vjet.dsf.html.events.ISimpleJsEventHandler";
    String JsEventHandlerAdapter = "org.eclipse.vjet.dsf.resource.html.event.handler.JsEventHandlerAdapter";
    String JsRequestHandlerAdapter = "org.eclipse.vjet.dsf.resource.html.event.handler.JsRequestHandlerAdapter";
    String JsResponseHandlerAdapter = "org.eclipse.vjet.dsf.resource.html.event.handler.JsResponseHandlerAdapter";
    String JsServiceHandlerAdapter = "org.eclipse.vjet.dsf.resource.html.event.handler.JsServiceHandlerAdapter";
    String JsResource = "org.eclipse.vjet.dsf.resource.pattern.js.JsResource";
    String JsResourceSimpleName = "JsResource";
    String IComponentSpec = "org.eclipse.vjet.dsf.spec.component.IComponentSpec";
    String IComponentSpecSimpleName = "IComponentSpec";
    String BaseComponentSpec = "org.eclipse.vjet.dsf.spec.component.BaseComponentSpec";
    String BaseComponentSpecSimpleName = "BaseComponentSpec";
    String ReservationTicket = "org.eclipse.vjet.dsf.resource.reservation.ReservationTicket";
    String IJsResourceRef = "org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef";
    String IJsResourceRefSimpleName = "IJsResourceRef";
    String CodeGen = "org.eclipse.vjet.dsf.resource.utils.CodeGen";
    String JSDocument = "org.eclipse.vjet.dsf.html.js.JSDocument";
    String JSDocumentSimple = "JSDocument";
    String DomElement = "org.eclipse.vjet.dsf.html.js.IJsDomRef";
    String DImg = "org.eclipse.vjet.dsf.html.dom.DImg";
    String DA = "org.eclipse.vjet.dsf.html.dom.DA";
    String JsCmpMeta = "org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta";
    String JsCmpMetaSimpleName = "JsCmpMeta";
    String JsType = "org.eclipse.vjet.dsf.resource.pattern.js.JsType";
    String JsTypeSimpleName = "JsType";
    String BV = "org.eclipse.vjet.dsf.aggregator.jsref.internals.BV";
    String BVSimple = "BV";
    String IValueBinding = "org.eclipse.vjet.dsf.common.binding.IValueBinding";
    String IValueBindingSimple = "IValueBinding";
    String JsFunc = "org.eclipse.vjet.dsf.aggregator.jsref.JsFunc";
    String DPkg = "org.eclipse.vjet.dsf.aggregator.jsref.d";
    String IJsPropSetter = "org.eclipse.vjet.dsf.jsruntime.jsref.IJsPropSetter";
    String JsPropSetter = "org.eclipse.vjet.dsf.aggregator.jsref.JsPropSetter";
    String JsProp = "org.eclipse.vjet.dsf.aggregator.jsref.JsProp";
    String IJsPropSetterSimple = "IJsPropSetter";
    String JsPropSetterSimple = "JsPropSetter";
    String JsPropSimple = "JsProp";
    String HandlerHelper = "org.eclipse.vjet.dsf.aggregator.jsref.HandlerHelper";
    String HandlerType = "org.eclipse.vjet.dsf.aggregator.jsref.HandlerType";
    String VjBootstrapJsRef = "vjo.bootstrap.VjBootstrap";
    String VjBootstrapJsRefSimpleName = "VjBootstrap";
    String EventDispatcherJsr = "vjo.dsf.EventDispatcherJsr";
    String ServiceEngineJsr = "vjo.dsf.ServiceEngineJsr";
    String IComponentSpecs = "org.eclipse.vjet.dsf.spec.component.IComponentSpecs";
    String JsHandlerObjectEnum = "org.eclipse.vjet.dsf.resource.html.event.handler.JsHandlerObjectEnum";
    String DapEventPkg = "org.eclipse.vjet.dsf.dap.event.*";
    String DsfEvent = "org.eclipse.vjet.dsf.common.event.DsfEvent";
    String Event = "org.eclipse.vjet.dsf.jsnative.events.Event";
    String DapEvent = "org.eclipse.vjet.dsf.dap.event.DapEvent";
    String MouseEvent = "org.eclipse.vjet.dsf.jsnative.events.MouseEvent";
    String KeyEvent = "org.eclipse.vjet.dsf.jsnative.events.KeyboardEvent";
    String DsfEventSimpleName = "DsfEvent";
    String EventSimpleName = "Event";
    String DapEventSimpleName = "DapEvent";
    String MouseEventSimpleName = "MouseEvent";
    String KeyEventSimpleName = "KeyboardEvent";
    String IDapEventListener = "org.eclipse.vjet.dsf.dap.event.listener.IDapEventListener";
    String DapHandlerAdapter = "org.eclipse.vjet.dsf.dap.rt.DapHandlerAdapter";
//  String JsNative = "org.eclipse.vjet.dsf.jsnative.anno.JsNative";
    String DapHandlerAdapterSimpleNamePkg = "org.eclipse.vjet.dsf.dap.rt";
    String IDapEventListenerPkg = "org.eclipse.vjet.dsf.dap.event.listener";
    String IDapEventListenerSimpleName = "IDapEventListener";
    String DapHandlerAdapterSimpleName = "DapHandlerAdapter";
//    String JsNativePkg = "org.eclipse.vjet.dsf.jsnative.anno";
//    String JsNativeSimpleName = "JsNative";
    String NativeJsProxyName = "org.eclipse.vjet.dsf.dap.proxy.NativeJsProxy";
    String NativeJsProxySimpleName = "NativeJsProxy";
    String ScriptableName = "org.mozilla.mod.javascript.Scriptable";
    String ScriptableSimpleName = "Scriptable";
    String IJsJavaProxyName = "org.mozilla.mod.javascript.IJsJavaProxy";
    String IJsJavaProxySimpleName = "IJsJavaProxy";
    String NativeJsTypeRef = "org.eclipse.vjet.dsf.dap.proxy.NativeJsTypeRef";
    String NativeJsTypeRefSimpleName = "NativeJsTypeRef";
    String INativeJsFuncProxy = "org.eclipse.vjet.dsf.dap.proxy.INativeJsFuncProxy";
    String INativeJsFuncProxySimpleName = "INativeJsFuncProxy";
    String NativeJsFuncProxy = "org.eclipse.vjet.dsf.dap.proxy.NativeJsFuncProxy";
    String NativeJsFuncProxySimpleName = "NativeJsFuncProxy";
    // TODO find EventDispatcher
    String EventDispatcherXName = "com.ebay.vjox.EventDispatcherX";
    String EventDispatcherXSimpleName = "EventDispatcherX";
    String EventDispatcherName = "vjo.dsf.EventDispatcher";
    String EventDispatcherSimpleName = "EventDispatcher";
    String OlName = "org.eclipse.vjet.dsf.dap.proxy.Ol";
    String OlSimpleName = "Ol";
    String ObjLiteralName = "org.eclipse.vjet.dsf.jsnative.global.ObjLiteral";
    String ObjLiteralSimpleName = "ObjLiteral";
    String JsObjectLiteral = "org.eclipse.vjet.dsf.aggregator.jsref.JsObjectLiteral";
    String JsObjectLiteralSimpleName = "JsObjectLiteral";
    String JsFuncRef = "org.eclipse.vjet.dsf.aggregator.jsref.JsFuncRef";
    String JsFuncRefSimpleName = "JsFuncRef";
    String FuncRef = "org.eclipse.vjet.dsf.dap.proxy.FuncRef";
    String FuncRefSimpleName = "FuncRef";
    String NativeJsHelper = "org.eclipse.vjet.dsf.dap.proxy.NativeJsHelper";
    String NativeJsHelperSimpleName = "NativeJsHelper";
    String JsTypeRef = "org.eclipse.vjet.dsf.aggregator.jsref.JsTypeRef";
    String JsTypeRefSimpleName = "JsTypeRef";
    String NativeOlKeysAnno = "org.eclipse.vjet.dsf.dap.proxy.NativeOlKeysAnno";
    String NativeOlKeysAnnoSimpleName = "NativeOlKeysAnno";
    String AIsOTypeAnno = "org.eclipse.vjet.dsf.javatojs.anno.AIsOType";
    String AIsOTypeAnnoSimpleName = "AIsOType";
    String NativeArrayName = "org.eclipse.vjet.dsf.jsnative.global.Array";
    String NativeArraySimpleName = "Array";
    String ArrayProxyName = "org.eclipse.vjet.dsf.dap.proxy.Array";
    String ArrayProxySimapleName = "Array";
    String JTypeName = "org.eclipse.vjet.dsf.dap.proxy.JType";
    String JTypeSimpleName = "JType";
    String JFunctionName = "org.eclipse.vjet.dsf.dap.proxy.JFunction";
    String JFunctionNameX = "org.eclipse.vjet.dsf.dap.proxy.JFunctionX";
    String JFunctionSimapleName = "JFunction";
    String FuncXName = "org.eclipse.vjet.dsf.dap.proxy.FuncX";
    String FuncXSimpleName = "org.eclipse.vjet.dsf.dap.proxy.FuncX";
    String NativeFunctionName = "org.eclipse.vjet.dsf.jsnative.global.Function";
    String NativeFunctionSimpleName = "Function";
    String AExcludeName = "org.eclipse.vjet.dsf.javatojs.anno.AExclude";
    String AExcludeSimpleName = "AExclude";
    String APropertyName = "org.eclipse.vjet.dsf.javatojs.anno.AProperty";
    String APropertySimpleName = "AProperty";
    String AJsProxyName = "org.eclipse.vjet.dsf.javatojs.anno.AJsProxy";
    String AJsProxySimpleName = "AJsProxy";
    String ARenameName = "org.eclipse.vjet.dsf.javatojs.anno.ARename";
    String ARenamePkg = "org.eclipse.vjet.dsf.javatojs.anno";
    String ARenameSimpleName = "ARename";
    String AJavaOnlyName = "org.eclipse.vjet.dsf.javatojs.anno.AJavaOnly";
    String AJavaOnlySimpleName = "AJavaOnly";
}