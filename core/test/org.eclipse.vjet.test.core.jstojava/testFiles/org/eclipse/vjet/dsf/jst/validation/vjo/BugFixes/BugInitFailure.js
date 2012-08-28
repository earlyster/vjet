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
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugInitFailure")
.protos({
	validProp: 1,
	invalidProp: this.validProp,
	invalidProp2: this.vj$.BugInitFailure.validProp1
})
.props({
	validProp1: 2,
	invalidProp3: new this.vj$.BugInitFailure(),
	validProp2: new Date(),
	validProp3: new Array(1),
	validProp4: new Date().getTime(),
	validProp5: document.createElement('span')
})
.endType();