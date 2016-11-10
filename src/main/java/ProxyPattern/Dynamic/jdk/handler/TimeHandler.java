package ProxyPattern.Dynamic.jdk.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Package Name : ProxyPattern.Dynamic.jdk.handler
 * Project Name : DesignPattern
 * Created by Lord_X_ on 2016/11/10 下午12:32
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        method.invoke(target, args);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束，行驶时间为：" + (endTime - startTime) + "毫秒！");
        return null;
    }
}
