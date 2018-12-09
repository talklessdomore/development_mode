package cn.linc.development.abstractFactory.demo;

public interface HumanFactroy {

    /**
     * 创建白人
     * @return
     */
    public Human createWhiteHuman();

    /**
     * 创建黑人
     * @return
     */
    public Human CreateBlackHuman();

    /**
     * 创建黄人
     * @return
     */
    public Human CreateYellowHuman();

}
