vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug5065') //< public
.props({
        //> public void foo()
        foo: function() {
			var f = new function(){alert('hello');};
        }
})
.endType();