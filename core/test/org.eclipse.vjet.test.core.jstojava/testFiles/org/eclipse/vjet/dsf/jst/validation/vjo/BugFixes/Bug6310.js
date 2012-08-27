vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310IType")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug6310MType")
.props({
	main: function(){
		var itype = new this.vj$.Bug6310IType();
		var mtype = new this.vj$.Bug6310MType();
	}
})
.endType();