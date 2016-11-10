package SingletonPattern;

/**
 * 单例模式最简单形势，饿汉模式。线程不安全
 * Created by Lord_X_ on 2016/11/9.
 */
public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is singleton 1.");
    }
}
