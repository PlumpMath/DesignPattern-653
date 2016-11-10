package ProxyPattern.Static.proxy;

import ProxyPattern.Static.Image;
import ProxyPattern.Static.impl.RealImage;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class ProxyImage implements Image {

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename) {
        this.filename = filename;
    }


    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        System.out.println(" before origin display() method called.");
        realImage.display();
        System.out.println(" after origin display() method called.");
    }


}
