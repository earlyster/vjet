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
vjo.ctype('vjoPro.samples.fundamentals.NeedsSample4')
.needs('vjoPro.samples.fundamentals.A')
.needs('vjoPro.samples.fundamentals.B','MyB')
.props({
//> public void main(String[] args)
main : function (args) {
document.writeln('main() called');
this.vj$.A.doA();
this.vj$.MyB.doB();
}
})
.endType();
