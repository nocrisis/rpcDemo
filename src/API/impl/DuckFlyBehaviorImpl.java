package API.impl;

import API.FlyBehavior;

public class DuckFlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly(String bird) {
        System.out.println("家养的" +bird + "不会飞");
    }

    @Override
    public String flyResult(String bird) {
        return "家养的" +bird + "不会飞" ;
    }
}
