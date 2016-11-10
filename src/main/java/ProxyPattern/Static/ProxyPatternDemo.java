package ProxyPattern.Static;

import ProxyPattern.Static.impl.RealImage;
import ProxyPattern.Static.proxy.ProxyImage;

/**
 * 静态代理
 * Created by zhoujiaxing on 2016/11/10.
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("hahaha.jpg");
        Image oldimage = new RealImage("hehehe.jpg");
        image.display();
//        oldimage.display();
        image.display();
    }
}
