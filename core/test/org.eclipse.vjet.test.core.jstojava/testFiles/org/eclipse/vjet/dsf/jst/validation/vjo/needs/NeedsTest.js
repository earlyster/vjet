vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.needs.NeedsTest")
//>needs(org.eclipse.vjet.dsf.jst.validation.vjo.needs.NeedsGlobal)
//this is just for the dependency graph to find the type in typespace
.props({
	main: function(){
		NG.foo();
		new NG();
	}
})
.endType();