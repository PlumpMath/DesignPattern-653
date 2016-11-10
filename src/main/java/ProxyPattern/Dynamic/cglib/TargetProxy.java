package ProxyPattern.Dynamic.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Package Name : ProxyPattern.Dynamic.cglib
 * Project Name : DesignPattern
 * Created by Lord_X_ on 2016/11/10 下午12:57
 */
public class TargetProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class<?> clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * 拦截所有目标方法调用
     * @param obj 目标实例对象
     * @param method 目标方法的反射对象
     * @param args 方法的参数
     * @param proxy 代理类的实例
     * @return
     * @throws Throwable
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("logging beginning ... ");
        proxy.invokeSuper(obj, args);
        System.out.println("logging endding ... ");
        return null;
    }
}
