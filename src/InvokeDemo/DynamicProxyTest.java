package InvokeDemo;


import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import API.impl.SwanFlyBehaviorImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        DuckFlyBehaviorImpl duckFlyBehaviorImpl = new DuckFlyBehaviorImpl();
        FlyBehaviorHandler flyBehaviorHandler = new FlyBehaviorHandler(duckFlyBehaviorImpl);
        FlyBehavior duckFlyBehavior = (FlyBehavior) Proxy.newProxyInstance(
                //代理类生成一个接口的实现类
                duckFlyBehaviorImpl.getClass().getClassLoader(),
                duckFlyBehaviorImpl.getClass().getInterfaces(),
                flyBehaviorHandler);
        duckFlyBehavior.fly("鸭子");

        SwanFlyBehaviorImpl swanFlyBehaviorImpl = new SwanFlyBehaviorImpl();
        FlyBehaviorHandler swanFlyBehaviorHandler = new FlyBehaviorHandler(swanFlyBehaviorImpl);
        FlyBehavior swanFlyBehavior = (FlyBehavior) Proxy.newProxyInstance(
                swanFlyBehaviorImpl.getClass().getClassLoader(),
                swanFlyBehaviorImpl.getClass().getInterfaces(),
                swanFlyBehaviorHandler);
        swanFlyBehavior.fly("天鹅");
    }

}
