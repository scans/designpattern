package cn.coolcc.designPatterns.factory.method;

/**
 * Created by chencheng on 17/1/6.
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
