package com.zc.demo1;

public class Test {
    public static void main(String[] args) {
        SougouSkin sougouSkin = new SougouSkin();
        DefalutSkin skin = new DefalutSkin();
        sougouSkin.setAbstractSkin(skin);
        sougouSkin.display();
    }
}
