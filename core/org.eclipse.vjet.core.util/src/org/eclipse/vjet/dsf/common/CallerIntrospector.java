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
package org.eclipse.vjet.dsf.common;
 public class CallerIntrospector extends SecurityManager {
      static CallerIntrospector instance = new CallerIntrospector();
      private CallerIntrospector() {}
      protected static Class<? extends Object> getCaller(int levelBack) {
          return instance.getClassContext()[levelBack];
      }
      public final static Class<? extends Object> getCallingClass() {
          return CallerIntrospector.getCaller(3);
      }
      public final static Class<? extends Object> getCallingClass(int levelBack) {
          return CallerIntrospector.getCaller(levelBack);
      }
  }