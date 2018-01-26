package cn.coolcc.designPatterns.visitor;

/**
 * Created by chencheng on 17/3/31.
 */
public interface Bill {
    void accept(Visitor visitor);
}
