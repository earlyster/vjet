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
package org.eclipse.vjet.dsf.common.resource;

  /** This is responsible for getting setting the resource resovler that
   * everybody shares.  The prefered interface for acccessing resources is
   * through the ResourceUtil static methods.  These methods are generally to
   * be used by the V3 system bootstrapper (init servlet, testing framework,
   * etc).
   */
  public class ResolverFactory {
  
      private static Resolver s_Resolver=null;
  
      /** gets the resource resolver shared by everybody.
       * @return Resolver - global instance shared by everybody.
       */
      public static Resolver getInstance() {
          if ( s_Resolver == null ) {
              s_Resolver = new DefaultResolver();
          }
          return s_Resolver;
      }
  
      /** sets the resource resolver shared by everbody.  This should be called
       * with extreme caution as it will effect everybody.
       * @param resolver - Resolver
       */
      public static void setResolver(final Resolver resolver) {
          if ( resolver == null ) {
              throw new NullResolverException();
          }
          s_Resolver = resolver;
  
          //System.out.println("Replacing Resolver with " + resolver.toString());
      }
  
  }