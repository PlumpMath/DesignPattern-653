package ProxyPattern.Static.impl;

import ProxyPattern.Static.Image;

/**
 * Created by Lord_X_ on 2016/11/10.
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDist(filename);
    }


    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }

    private void loadFromDist(String filename) {
        System.out.println("Loading from disk. ");
    }


}
