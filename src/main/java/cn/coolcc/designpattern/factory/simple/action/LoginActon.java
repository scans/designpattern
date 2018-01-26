package cn.coolcc.designPatterns.factory.simple.action;

/**
 * Created by chencheng on 17/5/16.
 */
public class LoginActon implements IAction {
    @Override
    public void execute() {
        System.out.println("这里写登陆逻辑");
    }
}
