package cn.coolcc.designPatterns.factory.method;

/**
 * Created by chencheng on 17/1/6.
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        factoryA.createProduct().method();
        Factory factoryB = new ConcreteFactoryB();
        factoryB.createProduct().method();
    }
}
