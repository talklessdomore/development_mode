package cn.linc.development.abstractFactory.demo;

public class NvWa {

    public static void main(String[] args) {
        /**
         * 女性工厂生产一个白人男性
         */
        MaleHumanFactory maleHumanFactory = new MaleHumanFactory();
        MaleWhiteHuman human =(MaleWhiteHuman) maleHumanFactory.createWhiteHuman();
        human.getSex();
        human.getColor();
        human.talk();

    }


}
