vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450")
.props({
	//>private void foo(Object);
	foo:function(obj){
	}
})
.inits(function(){
     this.foo({});
})
.endType();