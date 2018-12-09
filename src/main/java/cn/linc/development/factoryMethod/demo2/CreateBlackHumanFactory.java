package cn.linc.development.factoryMethod.demo2;

/**
 * 创建黑人的工厂
 */
public class CreateBlackHumanFactory implements AbstractHumanFactory {

    /**
     * 创建人
     * @return
     */
    public Human  createHuman() {
        return new Black();
    }
}
