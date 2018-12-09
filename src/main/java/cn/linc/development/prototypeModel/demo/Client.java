package cn.linc.development.prototypeModel.demo;

import java.util.Random;

public class Client {

    public static void main(String[] args) {
        AdvTemplate advTemplate = new AdvTemplate();
        Mail mail = new Mail(advTemplate);
        for (int i = 0;i<5;i++){
            mail.setAppellation(new Random().nextInt(20)+"");
            mail.setReceriver(new Random().nextInt(20)+"");
            mail.setTail("dd");
            Mail mail1 = mail.clone();
            System.out.println(mail1);
        }





    }


}
