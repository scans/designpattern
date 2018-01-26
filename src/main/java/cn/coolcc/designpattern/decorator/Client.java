package cn.coolcc.designPatterns.decorator;

/**
 * Created by chencheng on 17/1/10.
 */
public class Client {
    public static void main(String[] args) {
       /* Component component = new ConcreteComponent();
        component.method();

        ConcreteDecoratorA a = new ConcreteDecoratorA(component);
        a.methodA();
        a.method();

        ConcreteDecoratorB b = new ConcreteDecoratorB(a);
        b.methodB();
        b.method();*/


        String s = "chen";
        System.out.println(s.hashCode());
    }
}
