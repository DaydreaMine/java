package Fifth_Week.Monday;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;

public class SampleClass {

    public String test(String input){
        return "hello world";
    }

    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleClass.class);
        enhancer.setCallback(new FixedValue() {
            @Override
            public Object loadObject() throws Exception {
                return "嘿嘿嘿";
            }
        });
        SampleClass proxy = (SampleClass) enhancer.create();
        System.out.println(proxy.test(null));
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
      //  System.out.println(proxy.hashCode());
    }

}
