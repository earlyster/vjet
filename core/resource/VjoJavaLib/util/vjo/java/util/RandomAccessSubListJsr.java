package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.util.AbstractListJsr;
import vjo.java.util.RandomAccessJsr;
import vjo.java.util.SubListJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public class RandomAccessSubListJsr<E> extends SubListJsr<E> implements RandomAccessJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.util.RandomAccessSubList", RandomAccessSubListJsr.class, "RandomAccessSubList");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(AbstractListJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.util.ListJsr.ResourceSpec.getInstance())
        .addDependentComponent(RandomAccessJsr.ResourceSpec.getInstance())
        .addDependentComponent(SubListJsr.ResourceSpec.getInstance());

    protected RandomAccessSubListJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}