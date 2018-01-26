package cn.coolcc.designPatterns.singleton;

/**
 * Created by chencheng on 17/1/5.
 */
public class Singleton {

    private static Singleton INSTANCE;

    /**
     * 构造器私有
     */
    private Singleton() {
    }


    /**
     * 高并发下会出现多个实例,线程不安全
     *
     * @return 单例实体
     */
    /*public static Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }*/

    /**
     * 简单改进,在方法上加上synchronized,这样会非常影响效率,导致过多的线程等待.
     */
    /*public static synchronized Singleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }*/

    /**
     * double check,在实例不等于null时直接获取,避免了同步。
     * double check 原因: 假设我们去掉同步块中的是否为null的判断，有这样一种情况，假设A线程和B线程都在同步块外面判断了INSTANCE为null，
     * 结果A线程首先获得了线程锁，进入了同步块，然后A线程会创造一个实例，此时INSTANCE已经被赋予了实例，A线程退出同步块，
     * 直接返回了第一个创造的实例，此时B线程获得线程锁，也进入同步块，此时A线程其实已经创造好了实例，B线程正常情况应该直接返回的，
     * 但是因为同步块里没有判断是否为null，直接就是一条创建实例的语句，所以B线程也会创造一个实例返回，此时就造成创造了多个实例的情况。
     * <p>
     * 经过刚才的分析，貌似上述双重加锁的示例看起来是没有问题了，但如果再进一步深入考虑的话，其实仍然是有问题的。
     * <p>
     * 如果我们深入到JVM中去探索上面这段代码，它就有可能（注意，只是有可能）是有问题的。
     * 因为虚拟机在执行创建实例的这一步操作的时候，其实是分了好几步去进行的，也就是说创建一个新的对象并非是原子性操作。在有些JVM中上述做法是没有问题的，
     * 但是有些情况下是会造成莫名的错误。
     * 首先要明白在JVM创建新的对象时，主要要经过三步。
     * <p>
     * 1.分配内存
     * 2.初始化构造器
     * 3.将对象指向分配的内存的地址
     * <p>
     * 这种顺序在上述双重加锁的方式是没有问题的，因为这种情况下JVM是完成了整个对象的构造才将内存的地址交给了对象。
     * 但是如果2和3步骤是相反的（2和3可能是相反的是因为JVM会针对字节码进行调优，而其中的一项调优便是调整指令的执行顺序），就会出现问题了。
     * 因为这时将会先将内存地址赋给对象，针对上述的双重加锁，就是说先将分配好的内存地址指给INSTANCE，然后再进行初始化构造器，
     * 这时候后面的线程去请求getInstance方法时，会认为INSTANCE对象已经实例化了，直接返回一个引用。如果在初始化构造器之前，这个线程使用了INSTANCE，就会产生莫名的错误。
     * <p>
     * <p>
     * 解决办法:使用 volatile 关键字约束INSTANCE,使之可见,保证对它的所有读写操作绑定成一个不可拆分的动作
     */
    /*public static Singleton getInstance() {
        if (null == INSTANCE) {
            synchronized (Singleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }*/
}
