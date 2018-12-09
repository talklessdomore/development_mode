package cn.linc.development.singleton.demo2;

/**
 * 懒汉式：有线程安全问题
 */
public class Emperor {
    //定义单例对象
    private static Emperor emperor = null;
    //私有化构造器
    private Emperor(){}
    //获取实例方法
    public static Emperor getInstance(){
        if(emperor!=null){
            return emperor;
        }
        emperor = new Emperor();
        return emperor;
    }

    //解决方法：不是最佳方案,建议使用demo1；最简单即完美
   // public static synchronized Emperor getInstance(){}

    //其他方法
    public static void say(){
        System.out.println("我是皇帝XXX");
    }


}
