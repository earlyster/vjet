/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.dsf.javatojs.translate.config;

import org.eclipse.vjet.dsf.javatojs.control.BaseTranslationInitializer;
import org.eclipse.vjet.dsf.javatojs.control.ITranslationInitializer;
import org.eclipse.vjet.dsf.javatojs.translate.TranslateCtx;
import org.eclipse.vjet.dsf.javatojs.translate.custom.anno.DefaultAnnoProcessor;
import org.eclipse.vjet.dsf.javatojs.translate.custom.jdk.JavaLangCustomTranslator;
import org.eclipse.vjet.dsf.javatojs.translate.custom.meta.MetaDrivenCustomTranslator;
import org.eclipse.vjet.dsf.jst.declaration.JstCache;
import org.eclipse.vjet.vjo.lib.LibManager;

public class VjoJavaLibConfigInitializer extends BaseTranslationInitializer
	implements ITranslationInitializer{

	public void initialize() {
		
		TranslateCtx ctx = TranslateCtx.ctx();	
		TranslateConfig config = ctx.getConfig();
		
		// Annotation processors
		DefaultAnnoProcessor annoProcessor = new DefaultAnnoProcessor();
		config.addAnnoProcessor(annoProcessor);
		
		// Custom translators
		config.addCustomTranslator(new MetaDrivenCustomTranslator(annoProcessor.getMetaProvider()))
			.addCustomTranslator(new JavaLangCustomTranslator());
		
		JstCache.getInstance().addLib(LibManager.getInstance().getJsNativeGlobalLib());
		JstCache.getInstance().addLib(LibManager.getInstance().getJavaPrimitiveLib());
	}
}