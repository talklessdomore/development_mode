package cn.linc.development.singleton.demo1;


public class Ministor {
    public static void main(String[] args) {
        for (int i = 0;i<3;i++ ){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }

}
