package vjo.java.util;

import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.ClassCastExceptionJsr;
import vjo.java.lang.IllegalArgumentExceptionJsr;
import vjo.java.util.RegularEnumSetJsr;
import vjo.java.util.JumboEnumSetJsr;
import vjo.java.lang.ClassUtilJsr;
import vjo.java.lang.CloneableJsr;
import vjo.java.util.AbstractSetJsr;
import vjo.java.lang.EnumJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public abstract class EnumSetJsr<E extends EnumJsr> extends AbstractSetJsr<E> implements CloneableJsr {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.util.EnumSet", EnumSetJsr.class, "EnumSet");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ClassCastExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(IllegalArgumentExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(RegularEnumSetJsr.ResourceSpec.getInstance())
        .addDependentComponent(JumboEnumSetJsr.ResourceSpec.getInstance())
        .addDependentComponent(ClassUtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(CloneableJsr.ResourceSpec.getInstance())
        .addDependentComponent(AbstractSetJsr.ResourceSpec.getInstance());

    protected EnumSetJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}