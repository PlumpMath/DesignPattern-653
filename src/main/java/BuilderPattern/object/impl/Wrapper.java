package BuilderPattern.object.impl;

import BuilderPattern.object.Packing;

/**
 * 外包装，纸盒
 * Created by Lord_X_ on 2016/11/9.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
