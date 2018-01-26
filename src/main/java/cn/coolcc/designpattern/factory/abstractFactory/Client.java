package cn.coolcc.designPatterns.factory.abstractFactory;

/**
 * Created by chencheng on 17/1/7.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new Creator1();
        creator.creatorProductA().run();
        creator.creatorProductB().run();

        creator = new Creator2();
        creator.creatorProductA().run();
        creator.creatorProductB().run();

    }
}
