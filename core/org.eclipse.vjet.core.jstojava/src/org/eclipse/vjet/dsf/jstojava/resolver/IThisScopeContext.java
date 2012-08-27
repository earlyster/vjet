/**
 * 
 */
package org.eclipse.vjet.dsf.jstojava.resolver;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstType;

/**
 * A 'this' object resolver context.
 * 
 * @author paragraval
 * 
 */
public interface IThisScopeContext {

	/**
	 * Returns the current {@link IJstType} in which 'this' is referred
	 * 
	 * @return
	 */
	public IJstType getCurrentJstType();

	/**
	 * Returns the current {@link IJstMethod} in which 'this' is referred
	 * 
	 * @return
	 */
	public IJstMethod getCurrentMethod();

	/**
	 * Returns the 'this' type based on the scope in which its called.
	 * 
	 * @return
	 */
	public IJstType getThisType();

	/**
	 * Sets the type for 'this'
	 * 
	 * @param thisType
	 */
	public void setThisType(IJstType thisType);

}
