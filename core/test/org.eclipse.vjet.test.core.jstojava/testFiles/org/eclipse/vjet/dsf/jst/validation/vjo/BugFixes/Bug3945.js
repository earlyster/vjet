/*******************************************************************************
 * Copyright (c) 2012 eBay Inc. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     eBay Inc. - initial API and implementation
 *******************************************************************************/
vjo.ctype('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.Bug3945')
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.ClassA')
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.IA')
.needs('org.eclipse.vjet.dsf.jst.validation.vjo.BugFixes.EnumA')
.props({
     
})
.protos({
  //> public void test_getPackageName()
    test_getPackageName:function(){
        var v_clasObj1=vjo.Object.clazz;
        assertEquals("vjo",v_clasObj1.getPackageName());
        assertEquals("vjo",new vjo.Object().getClass().getPackageName());
    },
    //> public void test_getPackageName1()
    test_getPackageName1:function(){
        var v_clasObj1=vjo.Class.clazz;
        assertEquals("vjo",v_clasObj1.getPackageName());
    },
    //> public void test_getPackageName2()
    test_getPackageName2:function(){
        var v_clasObj1=this.vj$.ClassA.clazz;
        assertEquals("org.eclipse.vjet.dsf.tests.js.rt.clz.tc1",v_clasObj1.getPackageName());
        assertEquals("org.eclipse.vjet.dsf.tests.js.rt.clz.tc1",new this.vj$.ClassA().getClass().getPackageName());
    },
    //> public void test_getPackageName3()
    test_getPackageName3:function(){
        var v_clasObj1=this.vj$.IA.clazz;
        assertEquals("org.eclipse.vjet.dsf.tests.js.rt.clz.tc1",v_clasObj1.getPackageName());
    },
    //> public void test_getPackageName4()
    test_getPackageName4:function(){
        var v_clasObj1=this.vj$.EnumA.clazz;
        assertEquals("org.eclipse.vjet.dsf.tests.js.rt.clz.tc1",v_clasObj1.getPackageName());
        assertEquals("org.eclipse.vjet.dsf.tests.js.rt.clz.tc1",this.vj$.EnumA.FRIDAY.getClass().getPackageName());
    }

})
.endType();