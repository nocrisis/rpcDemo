package InvokeDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class FlyBehaviorHandler implements InvocationHandler {

    private Object obj;
    //被代理类（真实对象）

    public FlyBehaviorHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("now in FlyBehaviorHandler, before invocation");
        System.out.println("now interface implements " + obj.getClass());

        Object ret = method.invoke(obj, args);
        //执行被代理类方法

        System.out.println("now in FlyBehaviorHandler, after invocation");
        System.out.println();
        return ret;

    }
}
