package SingletonPattern;

/**
 * 重要！！！！！！！！
 * 双重锁校验机制。
 * 安全，且多线程下保持高性能
 * Created by Lord_X_ on 2016/11/9.
 */
public class Singleton4 {

    private volatile static Singleton4 instance;

    private Singleton4() {

    }
    public static Singleton4 getSingleton() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is singleton 4.");
    }

}
