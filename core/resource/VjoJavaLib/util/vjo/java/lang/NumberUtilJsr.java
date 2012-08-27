package vjo.java.lang;

import org.eclipse.vjet.dsf.aggregator.jsref.JsObj;
import org.eclipse.vjet.dsf.aggregator.jsref.internals.JsCmpMeta;
import org.eclipse.vjet.dsf.aggregator.jsref.JsObjData;
import org.eclipse.vjet.dsf.spec.component.IComponentSpec;
import org.eclipse.vjet.dsf.resource.pattern.js.JsResource;
import org.eclipse.vjet.dsf.resource.pattern.js.IJsResourceRef;
import vjo.java.lang.ByteJsr;
import vjo.java.lang.DoubleJsr;
import vjo.java.lang.FloatJsr;
import vjo.java.lang.IntegerJsr;
import vjo.java.lang.LongJsr;
import vjo.java.lang.ShortJsr;
import vjo.java.lang.NumberFormatExceptionJsr;
import vjo.java.lang.UtilJsr;
import vjo.java.lang.reflect.ArrayJsr;

@org.eclipse.vjet.dsf.resource.utils.CodeGen("JsrGenerator")
public abstract class NumberUtilJsr extends JsObj {
    private static final long serialVersionUID = 1L;

    private static final JsObjData S = 
        new JsObjData("vjo.java.lang.NumberUtil", NumberUtilJsr.class, "NumberUtil");

    
    public static class ResourceSpec {
        public static IComponentSpec getInstance() {
            return S.getResourceSpec(); 
        }
        public static final JsResource RESOURCE = S.getJsResource();
        public static final IJsResourceRef REF = S.getJsResourceRef();
    }

    public static final IComponentSpec SPEC = S.getResourceSpec()
        .addDependentComponent(ByteJsr.ResourceSpec.getInstance())
        .addDependentComponent(DoubleJsr.ResourceSpec.getInstance())
        .addDependentComponent(FloatJsr.ResourceSpec.getInstance())
        .addDependentComponent(IntegerJsr.ResourceSpec.getInstance())
        .addDependentComponent(LongJsr.ResourceSpec.getInstance())
        .addDependentComponent(ShortJsr.ResourceSpec.getInstance())
        .addDependentComponent(NumberFormatExceptionJsr.ResourceSpec.getInstance())
        .addDependentComponent(UtilJsr.ResourceSpec.getInstance())
        .addDependentComponent(ArrayJsr.ResourceSpec.getInstance());

    protected NumberUtilJsr(JsCmpMeta cmpMeta, boolean isInstance, Object... args) {
        super(cmpMeta, isInstance, args);
    }
}