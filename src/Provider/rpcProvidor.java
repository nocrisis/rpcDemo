package Provider;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.RpcFrameworkSimple;

public class rpcProvidor {
    public static void main(String args[])throws Exception{
        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();
        RpcFrameworkSimple.export(duckFlyBehavior,666);
    }
}
