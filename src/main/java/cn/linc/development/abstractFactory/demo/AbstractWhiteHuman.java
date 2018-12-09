package cn.linc.development.abstractFactory.demo;

public abstract class AbstractWhiteHuman implements Human {

    public void talk() {
        System.out.println("英文");
    }

    public void getColor() {
        System.out.println("白色");
    }
}
