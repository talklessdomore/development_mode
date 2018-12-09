package cn.linc.development.factoryMethod.demo2;

/**
 * 创建黄人的工厂
 */
public class CreateYellowHumanFactory implements AbstractHumanFactory {

    /**
     * 创建人
     * @return
     */
    public Human  createHuman() {
        return new Yellow();
    }
}
