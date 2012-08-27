vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5482")
.props({

        //>public void foo(Date)
		foo: function(p1){
		    var b = p1?p1:new Date();
		}
})
.endType();
