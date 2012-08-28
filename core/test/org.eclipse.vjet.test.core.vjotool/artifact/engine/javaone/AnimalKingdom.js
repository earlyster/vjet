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
vjo.ctype('engine.javaone.AnimalKingdom') //< public
.needs(['engine.javaone.Lion',
        'engine.javaone.Tiger',
        'engine.javaone.Liger'])
.props({
	main:function() {
		var lion = new this.vj$.Lion('Leo', 450, true); //< Lion
		var tigress = new this.vj$.Tiger('Tigris', 350, false); //< Tiger
		var son = new this.vj$.Liger(lion, tigress, 'Hercules', true); //< Liger
		if (son.getFather() === lion) {
			vjo.sysout.println("object identity is preserved");
		}
		vjo.sysout.println(son.getGene());
		vjo.sysout.println(son.getWeight());
		vjo.sysout.println(son.getFatherName());
		vjo.sysout.println(son.getMotherName());
		
		var hasMarriedParents = son.areParentsMarried();
		vjo.sysout.println('marriedParents: ' + hasMarriedParents);
		lion.marryTo(tigress);
		vjo.sysout.println('marriedParents: ' + son.areParentsMarried());
	}
})
.endType();