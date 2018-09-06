package Provider;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.RpcFrameworkSimple;

public class RPCProvidor {
    public static void main(String args[])throws Exception{
        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();
        RpcFrameworkSimple.export(duckFlyBehavior,666);
    }
}
