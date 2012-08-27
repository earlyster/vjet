vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152') //< public
.needs(['org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152CType'])
//>needs org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5152IType
.props({
        //> public void main()
        main: function() {
        	var test = new this.vj$.Bug5152CType(); //< Bug5152IType
        	test.foo();
        }
})
.endType();
