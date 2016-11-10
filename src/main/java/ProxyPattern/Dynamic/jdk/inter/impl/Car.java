package ProxyPattern.Dynamic.jdk.inter.impl;

import ProxyPattern.Dynamic.jdk.inter.Moveable;

import java.util.Random;

/**
 * Package Name : ProxyPattern.Dynamic.jdk.inter.impl
 * Project Name : DesignPattern
 * Created by Lord_X_ on 2016/11/10 下午12:26
 */
public class Car implements Moveable {

    @Override
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("car is moving...");
    }
}
