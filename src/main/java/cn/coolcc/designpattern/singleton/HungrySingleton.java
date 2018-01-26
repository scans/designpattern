package cn.coolcc.designPatterns.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by chencheng on 17/1/5.
 */
public class HungrySingleton implements Serializable {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 如果实现了Serializable, 必须重写这个方法
     */
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
