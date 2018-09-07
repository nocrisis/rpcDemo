package Provider;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import API.impl.SwanFlyBehaviorImpl;
import RPCFramwork.rpcFrameworkSimple;

public class rpcProvidor {
    public static void main(String[] args)throws Exception{
        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();
        FlyBehavior swanFlyBehavior= new SwanFlyBehaviorImpl();
        System.out.println("开始暴露DuckFlyBehaviorImpl的服务");
        rpcFrameworkSimple.export(duckFlyBehavior,666);
        System.out.println("开始暴露SwanFlyBehaviorImpl的服务");
        rpcFrameworkSimple.export(swanFlyBehavior,555);
    }
}
