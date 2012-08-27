vjo.mtype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803MType")
.expects("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803IType")
.protos({
	exists: function(){ //<public void exists()
		alert('overwritten exists');
	}
})
.endType();