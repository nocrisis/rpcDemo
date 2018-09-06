package Consumer;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.RpcFrameworkSimple;

public class rpcConsumer {
    public static void main(String[] args)throws Exception{
        FlyBehavior duckFlyBehavior= new DuckFlyBehaviorImpl();
        Object result = RpcFrameworkSimple.refer(FlyBehavior.class,"10.0.2.15",666);
        System.out.println(result);
    }
}
