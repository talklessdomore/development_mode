package cn.linc.development.templateModel.demo2;


public class HumerModel2 extends HummerModel {

    @Override
    public void start() {
        System.out.println("悍马一模型2启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马一模型2停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马一模型2鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马一模型2启动引擎");
    }

}
