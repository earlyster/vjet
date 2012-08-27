package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public interface ComparatorJsr<T> {
    JsObjData S = 
        new JsObjData("vjo.java.util.Comparator", ComparatorJsr.class, "Comparator");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec();
}