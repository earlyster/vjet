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
vjo.ctype('handler.HandlerTest')

.needs('nonStaticPropAdvisor.ProtosAdvisorTest')

.needs('nonStaticPropAdvisor.ProtosAdvisorTest1', 'myAlias1')

.inherits('nonStaticPropAdvisor.ProtosAdvisorAType')

.satisfies('nonStaticPropAdvisor.ProtosAdvisorIType')

.mixin('nonStaticPropAdvisor.ProtosAdvisorMType')

.props({
    staticProperty1 : null,  //< public staticProperty1

    staticProperty2 : null, //< private staticProperty2

    staticFunc1 : function() { //< public void staticFunc1()

      var  x  =  Math.random(); 

              var y = new Date().getHours();

              window.alert("");

              document.getElementById("");
    },

    staticFunc2 : function(str) { //< private void staticFunc2(String str)

    },

    main : function() { //< public void main(String ... argguments)
      
    }

})
.protos({

    property1 : 10, //< public property1

    property2 : 10, //< private property2

    constructs : function() { //< public constructs()
        
    },

    func1 : function() { //< public void func1()

      var  xx  =  Math.random(); 

              var yy = new Date().getHours();

              var s = ''; //<String

              window.alert("");

              document.getElementById("");

              var v = window.alert("hello world");
              
              var v1 = this.toString();

              var v2 = this.vj$.myAlias1.getClass();

              this.toString();

              this.vj$.myAlias1.getClass();

              this.vj$.ProtosAdvisorTest1.getClass();
    },

    func2 : function() { //< private void func2()
    	var i = 100;
    	var f;//<void function(int);
        f();
    }

})
.inits (function(){

})
.endType();
