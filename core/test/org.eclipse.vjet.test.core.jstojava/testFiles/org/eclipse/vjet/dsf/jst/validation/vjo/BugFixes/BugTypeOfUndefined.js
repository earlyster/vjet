vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.BugTypeOfUndefined')
.protos({

	//> public void foo(String)
	foo: function(arg){
		if(typeof(undeclared) == 'undefined'){
			return;
		}
		else if(typeof(this.undeclared) == 'undefined'){
			return;
		}
	}
})
.endType();