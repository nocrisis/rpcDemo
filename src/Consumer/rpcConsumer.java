package Consumer;

import API.FlyBehavior;
import API.impl.DuckFlyBehaviorImpl;
import RPCFramwork.rpcFrameworkSimple;

public class rpcConsumer {
    public static void main(String[] args)throws Exception{
//        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();本地
        FlyBehavior duckFlyBehavior = rpcFrameworkSimple.refer(FlyBehavior.class,"192.168.2.63",666);
        System.out.println("开始调用duck的fly方法");
        String duckResult = duckFlyBehavior.fly("家鸭");

        FlyBehavior swanFlyBehavior=rpcFrameworkSimple.refer(FlyBehavior.class,"192.168.2.63",555);
        System.out.println("开始调用swan的fly方法");
        String swanResult = swanFlyBehavior.fly("天鹅");

        System.out.println(duckResult+","+swanResult);
    }
}
