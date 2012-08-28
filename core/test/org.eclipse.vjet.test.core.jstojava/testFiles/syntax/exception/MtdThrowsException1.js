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
vjo.ctype('syntax.exception.MtdThrowsException1')
.props({
	sayEx: function(){//<public void sayEx throws Error
		//valid method declaration
	},
	
	main: function(){
		this.sayEx();
		//throws exception, should be captured or main should throws as well
		
		try{
			this.sayEx();
		}
		catch(err){//<Error
			
		}
	}
})