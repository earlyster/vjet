vjo.ctype("org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8455")
//>needs org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450
.props({
      //> public void test(Object)
      test: function (pReq){
		alert(org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450.clazz);
		
		var o1 = new this.vj$.Bug8450();//<Bug8450
		
		var o2 = new org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug8450();//<Bug8450
      }
})
.endType();