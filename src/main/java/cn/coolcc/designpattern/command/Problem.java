package cn.coolcc.designPatterns.command;

/**
 * Created by chencheng on 7/1/11.
 */
public class Problem implements Task {
    private Programmer programmer;

    public Problem(Programmer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void handle() {
        programmer.handleProblem();
    }
}
