package SingletonPattern;

/**
 * 单例模式
 * Created by Lord_X_ on 2016/11/9.
 */
public class CallSingleton {

    public static void main(String[] args) {
        // 枚举方式
        Singleton6 instance = Singleton6.INSTANCE;
        Singleton6 instance1 = Singleton6.INSTANCE;

        System.out.println("Is instance equals instance1 ? Answer: " + (instance == instance1));

        // 双锁校验机制。
        Singleton4 instance4 = Singleton4.getSingleton();
        Singleton4 instance41 = Singleton4.getSingleton();

        System.out.println("Is instance4 equals instance41 ? Answer: " + (instance41 == instance4));

        // 静态内部类方式。
        Singleton5 instance5 = Singleton5.getIntance();
        Singleton5 instance51 = Singleton5.getIntance();
        System.out.println(instance5 == instance51);
    }
}
