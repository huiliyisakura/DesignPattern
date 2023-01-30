package com.zc.demo1;

public class SougouSkin {

    private AbstractSkin abstractSkin;

    public  void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        abstractSkin.display();
    }
}
