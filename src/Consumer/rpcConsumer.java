package Consumer;

import API.FlyBehavior;
import RPCFramwork.ClientReferService;

public class rpcConsumer {
    public static void main(String[] args)throws Exception{
//        FlyBehavior duckFlyBehavior = new DuckFlyBehaviorImpl();本地new出服务
        System.out.println("开始引用duck的服务");
        FlyBehavior duckFlyBehavior = ClientReferService.refer(FlyBehavior.class,"192.168.2.63",666);
        System.out.println("开始调用duck的fly方法");
        String  result = duckFlyBehavior.flyResult("家鸭");
        System.out.println(result);

       /* System.out.println("开始引用swan的服务");
        FlyBehavior swanFlyBehavior=ClientReferService.refer(FlyBehavior.class,"192.168.2.63",555);
        System.out.println("开始调用swan的fly方法");
        swanFlyBehavior.flyResult("天鹅");*/

    }
}
