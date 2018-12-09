package cn.linc.development.templateModel.demo1;


public class HumerModel1 extends HummerModel{

    @Override
    public void start() {
        System.out.println("悍马一模型1启动");
    }

    @Override
    public void stop() {
        System.out.println("悍马一模型1停止");
    }

    @Override
    public void alarm() {
        System.out.println("悍马一模型1鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马一模型1启动引擎");
    }


}
