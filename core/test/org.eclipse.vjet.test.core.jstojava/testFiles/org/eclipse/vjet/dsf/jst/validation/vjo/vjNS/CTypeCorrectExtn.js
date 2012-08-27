vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.CTypeCorrectExtn")
.needs(["org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.ITypeCorrect"])
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.vjNS.ITypeCorrect')
.protos({
	
    property : 10, //<int

	//> public constructs()
	constructs: function(){
		this.property = 20;
	},

	//> public void doIt()
	doIt : function () {
	   alert(this.property);
	   
	   var clz = this.vj$.ITypeCorrect;
	}
})
.endType();