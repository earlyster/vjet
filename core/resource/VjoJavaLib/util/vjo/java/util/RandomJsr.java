package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObj;
import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.SystemJsr;
import vjo.java.lang.IllegalArgumentExceptionJsr;
import vjo.java.lang.UtilJsr;
import vjo.java.lang.IntegerJsr;
import vjo.java.lang.MathJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class RandomJsr extends JsObj {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.util.Random", RandomJsr.class, "Random");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(SystemJsr.ResourceSpec.getInstance())
        .addDependentComponent(IllegalArgumentExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(UtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(IntegerJsr.ResourceSpec.getInstance())
        .addDependentComponent(MathJsr.ResourceSpec.getInstance());

    protected RandomJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}