vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803CType")
.satisfies("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803IType")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6803MType")
.props({
	main: function(){ //<public void main()
		var sample = this.vj$.Bug6803CType();//<Bug6803CType
		sample.exists();
	}
})
.endType();