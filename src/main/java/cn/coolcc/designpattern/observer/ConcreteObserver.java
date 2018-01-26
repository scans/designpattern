package cn.coolcc.designPatterns.observer;

/**
 * Created by chencheng on 17/1/7.
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("观察到 " + observable.getClass().getSimpleName() + " 的变化");
        System.out.println("做出相应改变");
    }
}
