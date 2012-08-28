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
package org.eclipse.vjet.dsf.common.xml;
  public class XmlEncoder {
  
  
      /** Routine to make a string fully safe to pass through the XML transform.  Converts five
       * troublesome characters into their HTML equivalents. */
  
      public static final String encode(String  data){
          //RopeBuffer rb = new RopeBuffer(32, data.length());
          StringBuilder sb = new StringBuilder(data.length());
          for ( int i = 0; i < data.length(); ++i){
              char c = data.charAt(i);
              switch(c){
                  case '&' : sb.append("&amp;"); break;
                  case '\'': sb.append("&apos;"); break;
                  case '>' : sb.append("&gt;");   break;
                  case '<' : sb.append("&lt;");   break;
                  case '"' : sb.append("&quot;"); break;
                  default  : sb.append(c);
              }
          }
          
          return sb.toString();
           
      }
  
  
  }