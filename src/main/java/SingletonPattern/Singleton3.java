package SingletonPattern;

/**
 * 懒汉模式，线程安全
 * Created by Lord_X_ on 2016/11/9.
 */
public class Singleton3 {
    private static Singleton3 instance = null;
    private Singleton3(){

    }
    public static synchronized Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, this is Singleton 3.");
    }
}
