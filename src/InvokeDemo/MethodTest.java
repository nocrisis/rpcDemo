package InvokeDemo;

import API.FlyBehavior;
import API.impl.SwanFlyBehaviorImpl;

public class MethodTest {
    public static void main(String[] args) {
        FlyBehavior swanFlyBehavior = new SwanFlyBehaviorImpl();
        swanFlyBehavior.fly("天鹅");
    }
}
