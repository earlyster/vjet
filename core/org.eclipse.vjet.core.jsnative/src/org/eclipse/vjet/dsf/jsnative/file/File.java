package org.eclipse.vjet.dsf.jsnative.file;

import java.util.Date;

import org.eclipse.vjet.dsf.jsnative.anno.Property;

/*
 *   interface File : Blob {

      readonly attribute DOMString name;
      readonly attribute Date lastModifiedDate;
};
  
 */
public interface File extends Blob {

	@Property String getName();
	@Property Date getLastModifiedDate();
	
}
