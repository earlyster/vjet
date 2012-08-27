package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

@Alias("CSSCharsetRule")
public interface CssCharsetRule extends CssRule, IWillBeScriptable {

	/*
    encoding
    This property is of type String and can raise a DOMException object on setting.
*/
	@Property String getEncoding();

}
