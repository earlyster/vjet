vjo.ctype("vjet.dsf.jslang.feature.tests.BaseTestEcma3")
.inherits("vjet.dsf.jslang.feature.tests.BaseTest")
.protos({

constructs:function(){
vjo.sysout.println("base constructor called");

},

reportCompare: function(e,a,s) {
this.TestCase('',s,e,a);
}

})
.endType();
