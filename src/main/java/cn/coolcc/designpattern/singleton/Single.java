package cn.coolcc.designPatterns.singleton;

/**
 * 标准懒汉式单例模式:
 * 因为静态的只初始化一次,在类第一次被加载的时候,保证单例,没有并发问题,
 * 而且只有在调用getInstance时创建实例;
 * 其他推荐写法:利用枚举 @EnumSingle <<effective java>>中这么说 : 单元素的枚举类型已经成为实现Singleton的最佳方法
 * 其他不推荐写法:饿汉式 @HungrySingleton 缺点:没经过内部类处理,一旦访问任何HungrySingleton静态域就会创建实例,
 * 但是也许我们从始至终都不会用到它;存在序列化问题,如果实现Serializable,反序列化时单例会被破坏!--->解决办法:
 * 重写readResolve
 * private Object readResolve() throws ObjectStreamException {
 * return INSTANCE;
 * }
 */
public class Single {
    private Single() {
    }

    public static Single getInstance() {
        return Single.InnerSingle.instance;
    }

    private static class InnerSingle {
        static Single instance = new Single();
    }
}

