package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.BrowserSupport;
import org.eclipse.vjet.dsf.jsnative.anno.BrowserType;
import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

@BrowserSupport(BrowserType.IE_6P)
public interface BehaviorUrnsCollection extends IWillBeScriptable {

	/**
	 * Retrieves an object from the behaviorUrns collection.
	 */
	@Function
	Object item(int index);

	/**
	 * Gets or sets the number of objects in a collection.
	 */
	@Property
	int getLength();

	/**
	 * Gets or sets the number of objects in a collection.
	 */
	@Property
	void setLength(int length);

	/**
	 * Only for Rhino support
	 * 
	 * @param type
	 * @return
	 */
	@BrowserSupport({ BrowserType.RHINO_1P })
	@Function
	Object valueOf(String type);

}
