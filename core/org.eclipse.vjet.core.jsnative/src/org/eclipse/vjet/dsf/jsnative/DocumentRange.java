package org.eclipse.vjet.dsf.jsnative;

import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.mozilla.mod.javascript.IWillBeScriptable;

public interface DocumentRange extends IWillBeScriptable {

	@Function
	Range createRange();
	
}
