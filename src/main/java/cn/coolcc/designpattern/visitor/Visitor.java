package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public interface Visitor {
    void view(IncomeBill incomeBill);

    void view(ConsumeBill consumeBill);
}
