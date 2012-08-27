vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug4743') //< public
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.CTypeUtil')
.props({
        //>public void foo() 
        foo : function(){
               //this.vj$.util.staticFunc();
               var a = org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.CTypeUtil;
               a.staticFunc();
        }
})
.endType();
