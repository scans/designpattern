package cn.coolcc.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chencheng on 17/1/5.
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    public DynamicProxy(Object source) {
        this.source = source;
    }

    private void before() {
        System.out.println("开启事物");
    }

    private void after() {
        System.out.println("关闭事物");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object rs = method.invoke(source, args);
        after();
        return rs;
    }
}
