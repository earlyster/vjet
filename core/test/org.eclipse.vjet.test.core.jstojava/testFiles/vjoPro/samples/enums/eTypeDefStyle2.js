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
vjo.etype('vjoPro.samples.enums.eTypeDefStyle2')
.protos({
weekday : undefined, //< private boolean
displayName : undefined,

//snippet.enumstyle2.begin
//> private void contructs(boolean, String)
constructs : function (wkday, dispName) {
this.weekday = wkday;
this.displayName = dispName;
},
//snippet.enumstyle2.end

isWeekday : function () { //>public boolean
return this.weekday;
},

getDisplayName : function () {
return this.displayName;
}
})
//snippet.enumstyle2.begin
.values({
MON:[true, 'Monday'],
TUE:[true, 'Tuesday'],
WED:[true, 'Wednesday'],
THU:[true, 'Thursday'],
FRI:[true, 'Friday'],
SAT:[false, 'Saturday'],
SUN:[false, 'Sunday']
})
//snippet.enumstyle2.end
.endType();//End the Type Definition
