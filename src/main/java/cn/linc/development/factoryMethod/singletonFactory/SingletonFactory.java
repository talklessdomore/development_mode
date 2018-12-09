package cn.linc.development.factoryMethod.singletonFactory;


import java.lang.reflect.Constructor;

public class SingletonFactory {

    private static Singleton singleton;
    static {
        try {
            Class singletonClass = Class.forName(Singleton.class.getName());
            Constructor constructor = singletonClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton  =(Singleton)constructor.newInstance();
        }catch (Exception e){
            System.out.println("初始化单例类错误");
        }
    }

    public Singleton getSingleton(){
        return singleton;
    }

}
