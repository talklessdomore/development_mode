package cn.linc.development.builderModel.demo2;

public class Bezi extends CarModel {

    @Override
    public void start() {
        System.out.println("奔驰启动");
    }

    @Override
    public void stop() {
        System.out.println("奔驰停止");
    }

    @Override
    public void alarm() {
        System.out.println("奔驰鸣笛");
    }

    @Override
    public void engineBoom() {
        System.out.println("奔驰启动引擎");
    }

}
