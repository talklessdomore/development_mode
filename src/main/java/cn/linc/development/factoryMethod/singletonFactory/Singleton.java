package cn.linc.development.factoryMethod.singletonFactory;

public class Singleton {

    private Singleton(){}

    public void doSomeThing(){
        System.out.println("我被单例初始化了");
    }

}
