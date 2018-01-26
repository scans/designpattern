package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public class CAP implements Visitor {
    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("收入看看公司交税没");
    }

    @Override
    public void view(ConsumeBill consumeBill) {
        if (consumeBill.getItem().equals("工资")) {
            System.out.println("看看交税没");
        }
    }
}
