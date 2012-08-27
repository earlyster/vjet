package org.eclipse.vjet.dsf.jsnative.file;

import org.eclipse.vjet.dsf.jsnative.anno.Function;
import org.eclipse.vjet.dsf.jsnative.anno.Property;

/**
 * interface FileList {
      getter File item(unsigned long index);
      readonly attribute unsigned long length;
    }
 *
 */
public interface FileList {
	
	@Function File item(long index);
	@Property long getLength();
	
}
