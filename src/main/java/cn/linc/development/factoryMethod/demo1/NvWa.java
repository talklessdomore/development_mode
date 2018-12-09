package cn.linc.development.factoryMethod.demo1;

import cn.linc.development.factoryMethod.demo.AbstractHumanFactory;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("第一次造人");
        Human whiteHuman = HumanFactory.createHuman(White.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("第二次造人");
        Human blackHuman = HumanFactory.createHuman(Black.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("第三次造人");
        Human yelloHuman = HumanFactory.createHuman(Yellow.class);
        yelloHuman.getColor();
        yelloHuman.talk();
    }

}
