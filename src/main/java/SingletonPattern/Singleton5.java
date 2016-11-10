package SingletonPattern;

/**
 * 使用静态内部类机制。
 * 线程安全
 * 利用了classloader机制。
 * Created by Lord_X_ on 2016/11/9.
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5() {

    }

    public static final Singleton5 getIntance() {
        return SingletonHolder.INSTANCE;
    }
}
