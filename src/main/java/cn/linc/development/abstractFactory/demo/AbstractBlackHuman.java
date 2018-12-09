package cn.linc.development.abstractFactory.demo;

public abstract class AbstractBlackHuman implements Human {

    public void talk() {
        System.out.println("英文");
    }

    public void getColor() {
        System.out.println("黑色");
    }
}
