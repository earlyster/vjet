package org.eclipse.vjet.dsf.jstojava.resolver;

import org.eclipse.vjet.dsf.jst.term.NV;

public interface IOTypeResolver {
	String resolve(NV field);
	String[] getGroupIds();
}
