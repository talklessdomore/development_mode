package cn.linc.development.abstractFactory.demo;

public class FamaleHumanFactory implements HumanFactroy{

    public Human createWhiteHuman() {
        return new FamaleWhiteHuman();
    }

    public Human CreateBlackHuman() {
        return new FamaleBlackHuman();
    }

    public Human CreateYellowHuman() {
        return new FamaleYellowHuman();
    }
}
