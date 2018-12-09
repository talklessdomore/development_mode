package cn.linc.development.factoryMethod.demo2;

/**
 * 创建白人的工厂
 */
public class CreateWhiteHumanFactory implements AbstractHumanFactory {

    /**
     * 创建人
     * @return
     */
    public Human  createHuman() {
        return new White();
    }
}
