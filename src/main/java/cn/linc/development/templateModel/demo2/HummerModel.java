package cn.linc.development.templateModel.demo2;

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
        if(this.isAlarm()){
            this.alarm();
        }
        this.engineBoom();
    }

    public boolean isAlarm(){
        return  true;
    }


}
