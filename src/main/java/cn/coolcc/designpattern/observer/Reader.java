package cn.coolcc.designPatterns.observer;

/**
 * Created by chencheng on 17/1/7.
 */
public class Reader implements java.util.Observer {
    private String name;

    public Reader(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void subscribe(String name) {
        WriterManager.getInstance().getWriter(name).addObserver(this);
    }

    void unsubscribe(String name) {
        WriterManager.getInstance().getWriter(name).deleteObserver(this);
    }

    @Override
    public void update(java.util.Observable o, Object arg) {
        if (o instanceof Writer) {
            Writer writer = (Writer) o;
            System.out.println(writer.getName() + " release new book " + writer.getNewBook() + ",I'm subscriber " + this.getName());
        }
    }
}
