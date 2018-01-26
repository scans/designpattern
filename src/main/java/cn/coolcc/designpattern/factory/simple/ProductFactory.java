package cn.coolcc.designPatterns.factory.simple;

/**
 * Created by chencheng on 17/1/5.
 */
public class ProductFactory {

    public static Product getProduct(String productName) throws Exception {
        switch (productName) {
            case "product1":
                return new ConcreteProduct1();
            case "product2":
                return new ConcreteProduct2();
            default:
                throw new Exception("本工厂没有其他的产品");
        }
    }
}
