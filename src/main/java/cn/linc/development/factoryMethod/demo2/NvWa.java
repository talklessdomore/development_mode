package cn.linc.development.factoryMethod.demo2;

public class NvWa {
    public static void main(String[] args) {
        CreateWhiteHumanFactory whiteHumanFactory = new CreateWhiteHumanFactory();
        System.out.println("第一次造人");
        Human whiteHuman = whiteHumanFactory.createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();
        CreateBlackHumanFactory blackHumanFactory = new CreateBlackHumanFactory();
        System.out.println("第二次造人");
        Human blackHuman = blackHumanFactory.createHuman();
        blackHuman.getColor();
        blackHuman.talk();
        CreateYellowHumanFactory yellowHumanFactory = new CreateYellowHumanFactory();
        System.out.println("第三次造人");
        Human yelloHuman = yellowHumanFactory.createHuman();
        yelloHuman.getColor();
        yelloHuman.talk();
    }

}
