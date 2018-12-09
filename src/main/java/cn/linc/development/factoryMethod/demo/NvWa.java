package cn.linc.development.factoryMethod.demo;

public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("第一次造人");
        Human whiteHuman = humanFactory.createHuman(White.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("第二次造人");
        Human blackHuman = humanFactory.createHuman(Black.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("第三次造人");
        Human yelloHuman = humanFactory.createHuman(Yellow.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }

}
