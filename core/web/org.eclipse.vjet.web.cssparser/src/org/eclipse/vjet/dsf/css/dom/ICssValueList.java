/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.ebayopensource.dsf.css.dom;

/**
 * The <code>CSSValueList</code> interface provides the abstraction of an 
 * ordered collection of CSS values.
 * <p> Some properties allow an empty list into their syntax. In that case, 
 * these properties take the <code>none</code> identifier. So, an empty list 
 * means that the property has the value <code>none</code>. 
 * <p> The items in the <code>CSSValueList</code> are accessible via an 
 * integral index, starting from 0. 
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Style-20001113'>Document Object Model (DOM) Level 2 Style Specification</a>.
 * @since DOM Level 2
 */
public interface ICssValueList extends ICssValue {
    /**
     * The number of <code>CSSValues</code> in the list. The range of valid 
     * values of the indices is <code>0</code> to <code>length-1</code> 
     * inclusive.
     */
    int getLength();

    /**
     * Used to retrieve a <code>CSSValue</code> by ordinal index. The order in 
     * this collection represents the order of the values in the CSS style 
     * property. If index is greater than or equal to the number of values 
     * in the list, this returns <code>null</code>.
     * @param indexIndex into the collection.
     * @return The <code>CSSValue</code> at the <code>index</code> position 
     *   in the <code>CSSValueList</code>, or <code>null</code> if that is 
     *   not a valid index.
     */
    ICssValue item(int index);
}
