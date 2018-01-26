package cn.coolcc.designPatterns.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chencheng on 17/1/7.
 */
public class WriterManager {
    private Map<String, Writer> writers;

    private WriterManager() {
        writers = new HashMap<>();
    }

    public void add(Writer writer) {
        writers.put(writer.getName(), writer);
    }

    public Writer getWriter(String name) {
        return writers.get(name);
    }


    //熟悉下单例
    private static final WriterManager INSTANCE = Single.instance;

    private static class Single {
        static WriterManager instance = new WriterManager();
    }

    public static WriterManager getInstance() {
        return INSTANCE;
    }
}
