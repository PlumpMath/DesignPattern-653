package ProxyPattern.Dynamic.jdk;

import ProxyPattern.Dynamic.jdk.handler.TimeHandler;
import ProxyPattern.Dynamic.jdk.inter.Moveable;
import ProxyPattern.Dynamic.jdk.inter.impl.Car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理，基于接口实现。
 * 不能基于继承实现的原因：生成的代理类会继承Proxy类，而Java只支持单继承，所以代理类只能通过Implement的方式来扩展目标方法。
 *
 *
 * Package Name : ProxyPattern.Dynamic.jdk
 * Project Name : DesignPattern
 * Created by Lord_X_ on 2016/11/10 下午12:35
 */
public class DynamicProxyDemo {

    public static void main(String[] args) throws Exception {
        Car car = new Car();
        InvocationHandler handler = new TimeHandler(car);
        Class clazz = car.getClass();

        Moveable move = (Moveable) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), handler);
        move.move();
    }
}
