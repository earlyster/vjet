//this error test is more complicated as our references will reside in constructor calls
//or our referenced types will be meta types
vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeededInConstruction")
//>needs(org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded)
.props({
	main: function(){
		//this line should be an error
		new org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded();
	}
})
.endType();