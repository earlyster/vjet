vjo.ctype("vjet.dsf.format.UnicodeTests")
.inherits("vjet.dsf.jslang.feature.tests.BaseTest")
.protos({

test: function(){

this.TestCase(  "",
'var s = "PAS\\u0022SED"; s',
"PAS\"SED",
eval('var s = "PAS\\u0022SED"; s') );

}


}).endType();
