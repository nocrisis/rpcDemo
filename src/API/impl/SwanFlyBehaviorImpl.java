package API.impl;

import API.FlyBehavior;

public class SwanFlyBehaviorImpl implements FlyBehavior {
    @Override
    public void fly(String bird) {
        System.out.println("优雅的" + bird + "在天上飞");
    }
}
