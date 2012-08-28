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
vjo.etype('BugJsFiles.WeekDaysEType') //< public
.props({
	staticProp : 10,//<int
	staticProp1 : "Test", //<String
	staticFunc : function() {
		this.staticProp1.big();
	}
})
.protos({
	weekday : undefined, //< private boolean
	displayName : undefined,
	
	//> private void contructs(boolean, String)
	constructs : function (wkday, dispName) {
		
		this.displayName = dispName;
	},
	
	isWeekday : function () { //<public boolean isWeekday()
		return this.weekday;
	},
	
	getDisplayName : function () {
		return this.displayName;
	}
})
.values({
	MON:[true, 'Monday'],
	TUE:[true, 'Tuesday'],
	WED:[true, 'Wednesday'],
	THU:[true, 'Thursday'],
	FRI:[true, 'Friday'],
	SAT:[false, 'Saturday'],
	SUN:[false, 'Sunday']
})
.endType();