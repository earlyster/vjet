package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;
/*
 *     cssText
        This property is of type String and can raise a DOMException object on setting.
    cssValueType
        This read-only property is of type Number.
 *
 */
@Alias("CSSValue")
public interface CssValue extends IWillBeScriptable {

	@Property String getCssText();
	@Property int getCssValueType();
	
}
