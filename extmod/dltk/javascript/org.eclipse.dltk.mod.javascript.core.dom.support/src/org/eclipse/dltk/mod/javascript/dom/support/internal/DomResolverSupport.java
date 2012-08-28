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
package org.eclipse.dltk.mod.javascript.dom.support.internal;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.mod.javascript.dom.support.IDesignTimeDOMProvider;

public class DomResolverSupport {

	private static IDesignTimeDOMProvider[] providers;

	static {
		initProviders();
	}

	private static void initProviders() {
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(
						"org.eclipse.dltk.mod.javascript.core.domprovider");
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList providerList = new ArrayList();
		for (int a = 0; a < extensions.length; a++) {
			IConfigurationElement[] configurationElements = extensions[a]
					.getConfigurationElements();
			for (int b = 0; b < configurationElements.length; b++) {

				IConfigurationElement configurationElement = configurationElements[b];
				try {
					Object createExecutableExtension = configurationElement
							.createExecutableExtension("class");
					if (createExecutableExtension instanceof IDesignTimeDOMProvider) {
						providerList.add(createExecutableExtension);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				// System.out.println(configurationElement.getName());
			}
		}
		IDesignTimeDOMProvider[] pr = new IDesignTimeDOMProvider[providerList
				.size()];
		providerList.toArray(pr);
		providers = pr;
	}

	public static IDesignTimeDOMProvider[] getProviders() {
		return providers;
	}
}
