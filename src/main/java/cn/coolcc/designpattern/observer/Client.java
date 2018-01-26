package cn.coolcc.designPatterns.observer;

/**
 * Created by chencheng on 17/1/7.
 */
public class Client {
    public static void main(String[] args) {
        Writer writer1 = new Writer("陈诚");
        Writer writer2 = new Writer("欧阳");


        Reader reader1 = new Reader("aa");
        Reader reader2 = new Reader("bb");
        Reader reader3 = new Reader("cc");
        Reader reader4 = new Reader("dd");

        reader1.subscribe("陈诚");
        reader2.subscribe("陈诚");
        reader3.subscribe("陈诚");
        reader4.subscribe("陈诚");

        writer1.setNewBook("《设计模式》");
        reader4.unsubscribe("陈诚");

        System.out.println(reader4.getName() + "取消了对陈诚的订阅,不会再收到通知了");
        writer1.setNewBook("《数据结构》");


        reader1.subscribe("欧阳");
        reader2.subscribe("欧阳");
        writer2.setNewBook("《重构》");
        reader3.subscribe("欧阳");
        writer2.setNewBook("《effective java》");
    }
}
