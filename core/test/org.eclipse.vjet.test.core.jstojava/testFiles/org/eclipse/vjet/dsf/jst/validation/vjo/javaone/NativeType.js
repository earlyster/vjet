vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.javaone.NativeType') //< public
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.javaone.J4JType')
.props({
	main:function() {
		var data = {x:12, k1:'JavaOne'};
		var j4jType = new this.vj$.J4JType(data);
		vjo.sysout.println('[JS] ' + data.k2);
		var arr = ['cat', 'lion', 'tiger', 'liger'];
		var arr2 = j4jType.modify(arr);
		vjo.sysout.println('[JS] ' + (arr === arr2));
		vjo.sysout.println('[JS] ' + arr.toString());
	}
})
.endType();