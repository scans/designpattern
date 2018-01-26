package cn.coolcc.designPatterns.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by chencheng on 17/1/11.
 */
public class ProductManager {
    private List<Task> taskList;

    private List<Programmer> programmerList;

    private int index = 0;

    public ProductManager(Programmer... programmers) {
        if (null == programmers || programmers.length == 0) {
            throw new RuntimeException("快找人吧,老大,手下没人了!");
        }
        taskList = new ArrayList<>();
        programmerList = Arrays.asList(programmers);
    }

    public void receive(Task task) {
        taskList.add(task);
    }

    public void assign() {
        taskList.forEach(Task::handle);
    }

    public Programmer chooseProgrammer() {
        return programmerList.get(index == programmerList.size() ? 0 : index++);
    }
}
