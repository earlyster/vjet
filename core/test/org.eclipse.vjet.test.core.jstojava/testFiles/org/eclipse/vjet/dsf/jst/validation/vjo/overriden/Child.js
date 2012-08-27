vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.overriden.Child")
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.overriden.Parent")
.protos({
	
	//> public constructs()
	constructs: function(){
		this.base();
	},

	//> public void doIt()
	doIt : function () {
		alert("doIt overriden");
	},
	
	//> public void sayIt()
	sayIt: function(){
		alert("sayIt overriden");
	},
	
	//> protected void playIt()
	playIt: function(){
		alert("playIt overriden");
	}
})
.endType();