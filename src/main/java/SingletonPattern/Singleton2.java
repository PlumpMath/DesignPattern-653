package SingletonPattern;

/**
 * 懒汉模式，线程不安全
 * Created by Lord_X_ on 2016/11/9.
 */
public class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is singleton 2.");
    }
}
