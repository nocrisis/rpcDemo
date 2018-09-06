package Provider;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.rpcFrameworkSimple;

public class rpcProvidor {
    public static void main(String args[])throws Exception{
        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();
        rpcFrameworkSimple.export(duckFlyBehavior,666);
    }
}
