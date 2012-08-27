package vjo.java.lang;

import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.UtilJsr;
import vjo.java.lang.ComparableJsr;
import vjo.java.lang.NumberJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public final class FloatJsr extends NumberJsr implements ComparableJsr<vjo.java.lang.FloatJsr> {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.lang.Float", FloatJsr.class, "Float");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(UtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.lang.MathUtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(ComparableJsr.ResourceSpec.getInstance())
        .addDependentComponent(NumberJsr.ResourceSpec.getInstance());

    protected FloatJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}