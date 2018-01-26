package cn.coolcc.designPatterns.observer;

/**
 * Created by chencheng on 17/1/7.
 */
public class Writer extends java.util.Observable {
    private String name;
    private String newBook;

    public Writer(String name) {
        this.name = name;
        WriterManager.getInstance().add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewBook() {
        return newBook;
    }

    public void setNewBook(String newBook) {
        this.newBook = newBook;
        System.out.println("发布新书 " + newBook + " 通知小伙伴们");
        setChanged();
        notifyObservers();
    }
}
