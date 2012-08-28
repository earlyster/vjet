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
vjo.ctype('vjoPro.samples.enums.eTypeDefStyle2Client')
.needs('vjoPro.samples.enums.eTypeDefStyle2')
.props({
//> public void main(String[] args)
main:function(args){
document.writeln('this.vj$.eTypeDefStyle2.values() returns > ' + this.vj$.eTypeDefStyle2.values());
var mon = this.vj$.eTypeDefStyle2.MON;
document.writeln('this.vj$.eTypeDefStyle2.MON returns > ' + mon);
document.writeln('this.vj$.eTypeDefStyle2.MON.name() returns > ' + mon.name());
document.writeln('this.vj$.eTypeDefStyle2.MON.ordinal() returns > ' + mon.ordinal());
document.writeln('this.vj$.eTypeDefStyle2.MON.getDisplayName() returns > ' + mon.getDisplayName());
document.writeln('this.vj$.eTypeDefStyle2.MON.isWeekday() returns > ' + mon.isWeekday());
}
})
.endType();
