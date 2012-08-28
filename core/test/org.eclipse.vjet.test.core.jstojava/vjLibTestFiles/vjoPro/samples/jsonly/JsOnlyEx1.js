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
vjo.ctype('vjoPro.samples.jsonly.JsOnlyEx1') //< public
.needs(['vjoPro.dsf.EventDispatcher','vjoPro.dsf.document.Element'])
.props({
oED : vjoPro.dsf.EventDispatcher,
oElem : vjoPro.dsf.document.Element,
init : function () {
var self = this;//<Type::JsOnlyEx1
this.oED.add('sel1','change',function (evt) { self.changeFrame(evt); });
},
changeFrame : function (evt) {
//evt is a dsf Event, since we used add to wire it up,
//as opposed to addEventListener which would return the
//native browser event
var sel = evt.src;
var fr = this.oElem.get('if1');
fr.src = sel.value;

}
}).inits( function () {
vjoPro.dsf.EventDispatcher.addEventListener(window,'load',function () { vjoPro.samples.jsonly.JsOnlyEx1.init()});
})
.endType();
