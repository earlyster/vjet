vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.needs.NeedsTestError")
//>needs(org.eclipse.vjet.dsf.jst.validation.vjo.needs.NeedsGlobal)
//this is just for the dependency graph to find the type in typespace
.globals({
	NGE : org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded //<<
}, NG)
.props({
	main: function(){
		//this line should be error
		this.vj$.ActiveNeeded.foo();
		
		//this line should be error
		org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded.foo();
		new org.eclipse.vjet.dsf.jst.validation.vjo.needs.ActiveNeeded();
	}
})
.endType();