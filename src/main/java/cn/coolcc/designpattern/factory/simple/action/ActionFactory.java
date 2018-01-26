package cn.coolcc.designPatterns.factory.simple.action;

/**
 * Created by chencheng on 17/5/16.
 */
public class ActionFactory {

    public static IAction createAction(String actionName) throws Exception {
        if (actionName.equalsIgnoreCase("login")) {
            return new LoginActon();
        } else if (actionName.equalsIgnoreCase("register")) {
            return new RegisterActon();
        } else {
            throw new Exception("没得其他action");
        }
    }
}
