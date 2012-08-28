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
//< needs (vjoPro.dsf.utils.logging.LogRecord)
vjo.ctype("vjoPro.dsf.utils.logging.RootLogger")
.needs("vjoPro.dsf.utils.logging.LogManager")

.inherits("vjoPro.dsf.utils.logging.Logger")
.protos({
constructs: function(defaultLevel){
this.base("");
this.setLevel(defaultLevel);
},
//>public void logRecord(LogRecord)
logRecord: function(lr) {
// Make sure that the global handlers have been instantiated.
this.initializeGlobalHandlers();
this.base.logRecord(lr);
},

addHandler: function(h) {
this.initializeGlobalHandlers();
this.base.addHandler(h);
},

removeHandler: function(h) {
this.initializeGlobalHandlers();
this.base.removeHandler(h);
},

//> public Array getHandlers()
getHandlers: function() {
this.initializeGlobalHandlers();
return this.base.getHandlers();
},

//> public void initializeGlobalHandlers()
initializeGlobalHandlers: function(){
vjoPro.dsf.utils.logging.LogManager.getLogManager().initializeGlobalHandlers();
}
})
.endType();
