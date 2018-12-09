package cn.linc.development.builderModel.demo1;

public class BMW extends CarModel {

    @Override
    public void start() {
        System.out.println("bmw启动");
    }

    @Override
    public void stop() {
        System.out.println("bmw停止");
    }

    @Override
    public void alarm() {
        System.out.println("bmw鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("bmw启动引擎");
    }

}
