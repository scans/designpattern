package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 17/1/11.
 */
public class Programmer {

    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public void handleBug() {
        System.out.println(name + "解决了bug");
    }

    public void handleDemand() {
        System.out.println(name + "完成了新需求");
    }

    public void handleProblem() {
        System.out.println(name + "解决了线上问题");
    }
}
