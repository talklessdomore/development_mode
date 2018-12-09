package cn.linc.development.abstractFactory.demo;

public abstract class AbstractYellowHuman implements Human {

    public void talk() {
        System.out.println("中文");
    }

    public void getColor() {
        System.out.println("黄色");
    }
}
