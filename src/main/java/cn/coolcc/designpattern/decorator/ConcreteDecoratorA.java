package cn.coolcc.designPatterns.decorator;

/**
 * Created by chencheng on 17/1/10.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    public void methodA() {
        System.out.println("装饰器A扩展方法");
    }

    @Override
    public void method() {
        System.out.println("装饰器A包装");
        super.method();
        System.out.println("装饰器A包装结束");
    }
}
