package cn.coolcc.designPatterns.strategy;

/**
 * Created by chencheng on 17/1/8.
 */
public class Customer {

    private Double totalAmount = 0D;
    private Double amount = 0D;
    private CalPrice calPrice;

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Double getAmount() {
        return amount;
    }

    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        calPrice = CalPriceFactory.getInstance().getCalPrice(this);
    }

    public void pay() {
        System.out.println("客户最终支付: " + calPrice.calPrice(amount));
    }
}
