package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.IndexOutOfBoundsExceptionJsr;
import vjo.java.util.NoSuchElementExceptionJsr;
import vjo.java.lang.NullPointerExceptionJsr;
import vjo.java.util.AbstractListJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public abstract class AbstractSequentialListJsr<E> extends AbstractListJsr<E> {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.util.AbstractSequentialList", AbstractSequentialListJsr.class, "AbstractSequentialList");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(IndexOutOfBoundsExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(NoSuchElementExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(NullPointerExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.util.IteratorJsr.ResourceSpec.getInstance())
        .addDependentComponent(vjo.java.util.CollectionJsr.ResourceSpec.getInstance())
        .addDependentComponent(AbstractListJsr.ResourceSpec.getInstance());

    protected AbstractSequentialListJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}