package ProxyPattern.Dynamic.cglib;

/**
 * Spring CGlib动态代理，可以基于继承实现。
 * Package Name : ProxyPattern.Dynamic.cglib
 * Project Name : DesignPattern
 * Created by Lord_X_ on 2016/11/10 下午1:10
 */
public class DynamicProxyDemo {

    public static void main(String[] args) {
        TargetProxy proxy = new TargetProxy();
        Target target = (Target) proxy.getProxy(Target.class);

        target.move();
    }
}
