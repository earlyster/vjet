package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public interface MapJsr<K,V> {
    JsObjData S = 
        new JsObjData("vjo.java.util.Map", MapJsr.class, "Map");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(vjo.java.util.SetJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.util.CollectionJsr.ResourceSpec.getInstance());

    public static interface EntryJsr<K,V> {
    }
}