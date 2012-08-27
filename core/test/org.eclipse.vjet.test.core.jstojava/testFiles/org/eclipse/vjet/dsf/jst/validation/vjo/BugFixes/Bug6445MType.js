vjo.mtype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6445MType")
.expects("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6445IType")
.protos({
	//> public void bar()
	bar: function(){
		this.foo("no error");
	}
})
.endType();