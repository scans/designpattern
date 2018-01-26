package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public class Boss implements Visitor {
    @Override
    public void view(IncomeBill incomeBill) {
        System.out.println("本老板只关心一共花了多少钱：" + incomeBill.getAmount());
    }

    @Override
    public void view(ConsumeBill consumeBill) {
        System.out.println("本老板只关心一共收入钱：" + consumeBill.getAmount());
    }
}
