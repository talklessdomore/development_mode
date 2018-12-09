package cn.linc.development.factoryMethod.demo;

/**
 * 抽象工厂接口
 */
public interface AbstractHumanFactory {
    /**
     * 创建人的工厂
     * @param c 创建人的类
     * @param <T> 返回类型
     * @return
     */
    public <T extends Human> T createHuman(Class c);

}
