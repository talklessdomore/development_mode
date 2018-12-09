package cn.linc.development.templateModel.demo1;

/**
 * 悍马模型类
 */
public abstract class HummerModel {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public  void run(){
        this.start();
        this.stop();
        this.alarm();
        this.engineBoom();
    }


}
