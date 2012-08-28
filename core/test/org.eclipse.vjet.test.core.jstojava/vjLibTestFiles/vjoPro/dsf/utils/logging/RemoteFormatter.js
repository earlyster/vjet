/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
vjo.ctype("vjoPro.dsf.utils.logging.RemoteFormatter")
.needs("vjoPro.dsf.Json")
.inherits("vjoPro.dsf.utils.logging.Formatter")
.protos({
//> private constructs()
constructs: function(){
this.base("vjoPro.dsf.utils.logging.RemoteFormatter");
},

format: function(lr){
return JSON.stringify(lr);
}
})
.endType();
