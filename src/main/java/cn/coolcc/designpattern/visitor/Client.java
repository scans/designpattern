package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public class Client {
    public static void main(String[] args) {
        AccountBook accountBook = new AccountBook();


        accountBook.addBill(new IncomeBill(10000, "广告位"));
        accountBook.addBill(new IncomeBill(12000, "项目回款"));

        accountBook.addBill(new ConsumeBill(2000, "工资"));
        accountBook.addBill(new ConsumeBill(1000, "材料费"));


        Visitor boss = new Boss();
        Visitor cap = new CAP();

        accountBook.show(boss);
        accountBook.show(cap);
    }
}
