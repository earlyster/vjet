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
vjo.ctype("vjoPro.dsf.utils.jstrace.Trace")
.needs("vjoPro.dsf.utils.jstrace.Wrap")
.needs("vjoPro.dsf.utils.jstrace.TraceLogger")
.protos({
W : vjoPro.dsf.utils.jstrace.Wrap,//<Type::Wrap
L : vjoPro.dsf.utils.jstrace.TraceLogger,//<Type::TraceLogger
logger:null,//<TraceLogger
/**
* @access public
* @param {String} exp
* @param {java.util.Map} cfg
*/
//> public constructs(String exp, Object cfg)
constructs : function( exp, cfg){
var t = this;//<Trace

t.logger = new t.L(cfg);

//logger should go before wrap
t.W.wrap(exp, cfg);
}
})
.endType();
