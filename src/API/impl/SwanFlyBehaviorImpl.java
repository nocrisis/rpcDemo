package API.impl;

import API.FlyBehavior;

public class SwanFlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly(String bird) {
        System.out.println("优雅的" + bird + "在天上飞");
    }

    @Override
    public String flyResult(String bird) {
        return "优雅的" + bird + "在天上飞";
    }
}
