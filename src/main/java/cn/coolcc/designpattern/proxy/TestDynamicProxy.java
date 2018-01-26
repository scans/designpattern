package cn.coolcc.designPatterns.proxy;

import java.lang.reflect.Proxy;

/**
 * Created by chencheng on 17/1/5.
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        SomeService service = new SomeServiceImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(service);
        SomeService proxy = (SomeService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), dynamicProxy);

        proxy.save();
    }
}
