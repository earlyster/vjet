package vjo.java.lang;

import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.ThrowableJsr;
import vjo.java.lang.RuntimeExceptionJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class IllegalStateExceptionJsr extends RuntimeExceptionJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.lang.IllegalStateException", IllegalStateExceptionJsr.class, "IllegalStateException");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ThrowableJsr.ResourceSpec.getInstance())
        .addDependentComponent(RuntimeExceptionJsr.ResourceSpec.getInstance());

    protected IllegalStateExceptionJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}