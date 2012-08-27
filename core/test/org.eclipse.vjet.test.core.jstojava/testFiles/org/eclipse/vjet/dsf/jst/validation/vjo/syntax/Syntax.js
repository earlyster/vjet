vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.syntax.Syntax') //< public
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.INoExist")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.CNoExist")
.needs("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.MNoExist")
.satisfies("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.INoExist")
.inherits("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.CNoExist")
.mixin("org.eclipse.vjet.dsf.jst.validation.vjo.syntax.MNoExist")
.protos({
    //> Number a()
    a:function(){
        return 10;
    },
    
    //>C b()
	b:function(){
		return null;
	}
})
.props({
	p : "constant"
})
.endType();