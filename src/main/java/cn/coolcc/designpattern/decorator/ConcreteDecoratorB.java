package cn.coolcc.designPatterns.decorator;

/**
 * Created by chencheng on 17/1/10.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    public void methodB() {
        System.out.println("装饰器B扩展方法");
    }

    @Override
    public void method() {
        System.out.println("装饰器B包装");
        super.method();
        System.out.println("装饰器B包装结束");
    }
}
