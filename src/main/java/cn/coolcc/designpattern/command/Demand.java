package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 7/1/11.
 */
public class Demand implements Task {
    private Programmer programmer;

    public Demand(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void handle() {
        programmer.handleDemand();
    }
}
