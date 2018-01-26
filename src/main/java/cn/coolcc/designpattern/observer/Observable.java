package cn.coolcc.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chencheng on 17/1/7.
 */
public class Observable {
    private List<Observer> obs;


    public Observable() {
        obs = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        obs.add(observer);
    }

    public void notifyObservers() {
        System.out.println("有变化,通知所有观察者");
        for (Observer ob : obs) {
            ob.update(this);
        }
    }
}
