package cn.coolcc.designPatterns.strategy;

/**
 * Created by chencheng on 17/1/8.
 */
public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy(1000D);
        customer.pay();
        customer.buy(2000D);
        customer.pay();
        customer.buy(1000D);
        customer.pay();
    }
}
