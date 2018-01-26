package cn.coolcc.designPatterns.factory.abstractFactory;

/**
 * Created by chencheng on 17/1/7.
 */
public class Creator1 implements Creator {
    @Override
    public ProductA creatorProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB creatorProductB() {
        return new ProductB1();
    }
}
