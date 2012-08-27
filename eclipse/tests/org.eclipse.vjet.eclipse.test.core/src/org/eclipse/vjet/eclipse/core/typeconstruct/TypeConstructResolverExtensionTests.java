package org.eclipse.vjet.eclipse.core.typeconstruct;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.eclipse.vjet.dsf.jst.IJstParseController;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.IScriptUnit;
import org.eclipse.vjet.dsf.jst.ts.JstTypeSpaceMgr;
import org.eclipse.vjet.dsf.jstojava.controller.JstParseController;
import org.eclipse.vjet.dsf.jstojava.loader.DefaultJstTypeLoader;
import org.eclipse.vjet.dsf.jstojava.parser.VjoParser;
import org.eclipse.vjet.dsf.ts.event.type.AddTypeEvent;
import org.eclipse.vjet.dsf.ts.type.TypeName;
import org.eclipse.vjet.eclipse.core.test.VjetModelTestsPlugin;
import org.eclipse.vjet.vjo.lib.TsLibLoader;
import org.junit.Test;
import org.osgi.framework.Bundle;

public class TypeConstructResolverExtensionTests {

	@Test
	public void testResolverExtension() throws Exception {

		// scaffolding
		IJstParseController pc = new JstParseController(new VjoParser());
		JstTypeSpaceMgr ts = new JstTypeSpaceMgr(pc, new DefaultJstTypeLoader());
		ts.initialize();
		TsLibLoader.loadDefaultLibs(ts);

		Bundle bundle = VjetModelTestsPlugin.getDefault().getBundle();
		URL urlFooDefineTypeJS = bundle
				.getEntry("fixtures/typeconstruct/foodefinetype.js");
		System.out.println(urlFooDefineTypeJS);

		URL urlUsingFooDefineTypeJS = bundle
				.getEntry("fixtures/typeconstruct/usingfoodefinetype.js");

		System.out.println(urlUsingFooDefineTypeJS);
		// bootstrap types
		addTypeToTS(pc, ts, urlFooDefineTypeJS, "test", "Foo");

		// user defined type
		addTypeToTS(pc, ts, urlUsingFooDefineTypeJS, "test", "a.b.c.D");

		// reading from type space
		IJstType exttype = ts.getTypeSpace().getType(
				new TypeName("test", "Foo"));
		assertEquals("Foo", exttype.getName());
		IJstType type = ts.getTypeSpace().getType(
				new TypeName("test", "a.b.c.D"));
		assertEquals("a.b.c.D", type.getName());

	}

	private void addTypeToTS(IJstParseController pc, JstTypeSpaceMgr ts,
			URL file, String groupName, String typeName) {
		IScriptUnit su1 = pc.parseAndResolve(groupName, typeName,
				VjoParser.getContent(file));
		ts.processEvent(new AddTypeEvent<IJstType>(new TypeName(groupName, su1
				.getType().getName()), su1.getType()));
	}

}
