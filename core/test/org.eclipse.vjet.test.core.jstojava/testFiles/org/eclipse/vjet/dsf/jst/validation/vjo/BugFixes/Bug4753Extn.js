vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4753Extn') //< public 
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.CTypeUtil', 'util')
.props({
        //>public void foo() 
        foo : function(){
               this.vj$.noUtil.staticFunc();
        }
})
.endType();
