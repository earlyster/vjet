package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Alias;
import org.eclipse.vjet.dsf.jsnative.anno.Property;
import org.mozilla.mod.javascript.IWillBeScriptable;

@Alias("CSSStyleRule")
public interface CssStyleRule extends CssRule, IWillBeScriptable {

	@Property String getSelectorText();
	@Property CssStyleDeclaration getStyle();	
}
