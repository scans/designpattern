package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 7/1/11.
 */
public class Bug implements Task {
    private Programmer programmer;

    public Bug(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void handle() {
        programmer.handleBug();

    }
}
