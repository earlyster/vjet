package vjo.java.lang;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.util.IteratorJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public interface IterableJsr<T> {
    JsObjData S = 
        new JsObjData("vjo.java.lang.Iterable", IterableJsr.class, "Iterable");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(IteratorJsr.ResourceSpec.getInstance());
}