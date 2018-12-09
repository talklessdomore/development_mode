package cn.linc.development.singleton.demo1;

/**
 * 恶汉式：不存在线程安全问题
 */
public class Emperor {
    //定义单例对象
    private static final Emperor emperor = new Emperor();
    //私有化构造器
    private Emperor(){}
    //获取实例方法
    public static Emperor getInstance(){
        return emperor;
    }
    //其他方法
    public static void say(){
        System.out.println("我是皇帝XXX");
    }


}
