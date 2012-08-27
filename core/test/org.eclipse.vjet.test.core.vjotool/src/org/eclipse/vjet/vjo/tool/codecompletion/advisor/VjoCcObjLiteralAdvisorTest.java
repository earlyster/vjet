/*******************************************************************************
 * Copyright (c) 2005-2011 eBay Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.vjet.vjo.tool.codecompletion.advisor;




import java.util.List;

import org.eclipse.vjet.dsf.jst.IJstMethod;
import org.eclipse.vjet.dsf.jst.IJstProperty;
import org.eclipse.vjet.dsf.jst.IJstType;
import org.eclipse.vjet.dsf.jst.expr.MtdInvocationExpr;
import org.eclipse.vjet.dsf.jst.term.ObjLiteral;
import org.eclipse.vjet.dsf.jstojava.translator.robust.completion.JstFieldOrMethodCompletion;
import org.eclipse.vjet.dsf.ts.type.TypeName;
import org.eclipse.vjet.vjo.tool.codecompletion.IVjoCcProposalData;
import org.eclipse.vjet.vjo.tool.codecompletion.VjoCcBaseTest;
import org.eclipse.vjet.vjo.tool.codecompletion.VjoCcCtx;
import org.eclipse.vjet.vjo.tool.codecompletion.jsresource.CodeCompletionUtil;
import org.junit.Assert;
import org.junit.Test;



//@Category({P1,FAST,UNIT})
//@ModuleInfo(value="DsfPrebuild",subModuleId="VJET")
public class VjoCcObjLiteralAdvisorTest extends VjoCcBaseTest {
	public VjoCcObjLiteralAdvisor advisor = 
		new VjoCcObjLiteralAdvisor();
	
	@Test
	public void testObjLiteralAdviseBasic() {
		testProposals(CodeCompletionUtil.GROUP_NAME, 
				"objLiteralAdvisor.ObjLiteralTest", "ol", new String[]{"id: "});
	}
	
	@Test
	public void testObjLiteralAdviseOType() {
		testProposals(CodeCompletionUtil.GROUP_NAME, 
				"objLiteralAdvisor.ObjLiteralWithOTypeTest", "ol", new String[]{"id: "});
	}
	
	private void testProposals(final String group, 
			final String js,
			final String token,
			final String[] expected){
		VjoCcCtx ctx = getEmptyContext();
		TypeName typeName = new TypeName(group, js);
		IJstType actingType = getJstType(typeName);
		Assert.assertNotNull(actingType);
		ctx.setActingType(actingType);
		
		MtdInvocationExpr olCall = (MtdInvocationExpr)actingType.getMethod("main").getBlock().getStmts().get(0);
		ObjLiteral ol = (ObjLiteral)olCall.getArgs().get(0);
		Assert.assertNotNull(ol);
		
		final JstFieldOrMethodCompletion completion = new JstFieldOrMethodCompletion(ol, false);
		completion.setCompositeToken("");
		completion.setToken("");
		ctx.setCompletion(completion);
		
		advisor.advise(ctx);
		List<IVjoCcProposalData> datas = ctx.getReporter().getProposalData();
		Assert.assertNotNull(datas);
		Assert.assertEquals(expected.length, datas.size());
		
		OUT:
		for(IVjoCcProposalData data : datas){
			Assert.assertEquals(VjoCcObjLiteralAdvisor.ID, data.getAdvisor());
			Assert.assertNotNull(data.getData());
			if(data.getData() instanceof IJstProperty){
				final String name = ((IJstProperty)data.getData()).getName().getName();
				for(String check : expected){
					if(name.equals(check)){
						continue OUT;
					}
				}
				Assert.fail(name + " wasn't found!");
			}
			else if(data.getData() instanceof IJstMethod){
				final String name = ((IJstMethod)data.getData()).getName().getName();
				for(String check : expected){
					if(name.equals(check)){
						continue OUT;
					}
				}
				Assert.fail(name + " wasn't found!");
			}
			else{
				Assert.fail("proposal unknown: " + data);
			}
		}
	}
}
