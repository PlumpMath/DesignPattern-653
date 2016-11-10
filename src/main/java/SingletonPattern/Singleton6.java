package SingletonPattern;

/**
 * 枚举，实现单例的最佳方式。
 * 自动支持序列化机制，绝对防止多次实例化。
 * 多线程安全，可防止反序列化重新创建新的对象。
 * Created by Lord_X_ on 2016/11/9.
 */
public enum Singleton6 {
    INSTANCE;
    public void showMessage() {
        System.out.println("Hello, this is Singleton 6. Enum");
    }

}
