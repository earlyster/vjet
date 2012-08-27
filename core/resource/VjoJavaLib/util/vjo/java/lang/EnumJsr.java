package vjo.java.lang;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObj;
import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.SystemJsr;
import vjo.java.lang.ClassCastExceptionJsr;
import vjo.java.lang.ClassJsr;
import vjo.java.lang.ComparableJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public abstract class EnumJsr<E extends EnumJsr> extends JsObj implements ComparableJsr<E> {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.lang.Enum", EnumJsr.class, "Enum");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(SystemJsr.ResourceSpec.getInstance())
        .addDependentComponent(ClassCastExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(ClassJsr.ResourceSpec.getInstance())
        .addDependentComponent(ComparableJsr.ResourceSpec.getInstance());

    protected EnumJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}