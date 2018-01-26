package cn.coolcc.designPatterns.factory.simple.action;

/**
 * Created by chencheng on 17/5/16.
 */
public class RegisterActon implements IAction {
    @Override
    public void execute() {
        System.out.println("这里写注册逻辑");
    }
}
