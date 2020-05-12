单例模式问法：https://mp.weixin.qq.com/s/jLDD4qWD-Rq3haQxOPBSqw
破坏单例模式：http://www.justdojava.com/2019/08/21/Java-single-destroy-prevent/
枚举模式：https://juejin.im/post/5d64ca62f265da03b638bb47
/*
单例模式：
    一个类只有一个实例，且提供该实例的全局访问点
    参考：https://blog.csdn.net/itachi85/article/details/50510124

变量声明为static：
    1.声明为static的变量实质上就是全局变量
    2.当声明一个对象时，该类所有的实例变量共用同一个static变量
    3.在类装载时，只分配一块存储空间，所有此类的对象都可以操控此块存储空间
    参考：https://www.cnblogs.com/lzq198754/p/5767066.html
*/
/*
// 1.饿汉模式
public class Singleton{
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    // 优点：类加载时完成初始化，获取对象速度快；基于类加载避免多线程问题
    // 缺点：无法控制类对象的加载时间，创建

}
*/

/*
// 懒汉模式
// 线程不安全
public class Singleton{
    private static Singleton instance;

    private Singleton() {   
    }

    public static Singleton getInstance () {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 优点：类实例第一次调用时完成初始化，实现延迟加载
    // 缺点：线程不安全

}
// 线程安全
public class Singleton {
    private static Singleton instance;

    private Singleton(){  
    }

    public static synchronized Singleton getInstance () {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // 优点：线程安全
    // 缺点：多线程有开销
}
*/

/*
// 双重检查DCL（double checked locking）
public class Singleton {
    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance () {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // 双重检查：第一次检查如果不为空，直接返回实例；如果多个线程同时了通过了第一次检查，并且其中一个线程首先通过了
    // 第二次检查并实例化了对象，那么剩余通过了第一次检查的线程就不会再去实例化对象;除了初始化的时候会出现加锁的情况，
    // 后续的所有调用都会避免加锁而直接返回，解决了性能消耗的问题

    // instance变量用volatile修饰：使用了volatile关键字后，重排序被禁止，所有的写（write）操作都将发生在读（read）
    // 操作之前,防止访问的是一个初始化未完成的对象

    // 参考：https://www.cnblogs.com/xz816111/p/8470048.html

}
*/

/*
// 静态内部类单例模式（推荐）
public class Singleton {
    private Singleton(){}

    public static Singleton getInstance () {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    // 优点：第一次类加载时不会初始化，只有第一次调用getInstance()时才初始化；线程安全；
}
*/

