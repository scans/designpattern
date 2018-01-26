package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public class IncomeBill implements Bill {
    private double amount;
    private String item;

    public IncomeBill(double amount, String item) {
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.view(this);
    }
}
