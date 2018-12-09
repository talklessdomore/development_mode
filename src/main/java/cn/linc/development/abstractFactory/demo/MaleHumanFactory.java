package cn.linc.development.abstractFactory.demo;

public class MaleHumanFactory implements HumanFactroy{

    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human CreateBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human CreateYellowHuman() {
        return new MaleYellowHuman();
    }
}
