package cn.coolcc.designPatterns.factory.abstractFactory;

/**
 * Created by chencheng on 17/1/7.
 */
public class Creator2 implements Creator {
    @Override
    public ProductA creatorProductA() {
        return new ProductA2();
    }

    @Override
    public ProductB creatorProductB() {
        return new ProductB2();
    }
}
