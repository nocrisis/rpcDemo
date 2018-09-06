package Consumer;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.rpcFrameworkSimple;

public class rpcConsumer {
    public static void main(String[] args)throws Exception{
        FlyBehavior duckFlyBehavior = rpcFrameworkSimple.refer(FlyBehavior.class,"192.168.2.63",666);
        String result = duckFlyBehavior.fly("家鸭");
        System.out.println(result);
    }
}
