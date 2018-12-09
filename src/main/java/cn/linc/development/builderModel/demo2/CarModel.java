package cn.linc.development.builderModel.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 悍马模型类
 */
public abstract class CarModel {

    private List<String> sequences = new ArrayList<String>();

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

    public final  void run(){
        for (int i =0 ;i<sequences.size();i++){
            String operate = sequences.get(i);
            if(operate.equals("start")){
                this.start();
            }else if(operate.equals("stop")){
                this.stop();
            }else if(operate.equals("engine")){
                this.engineBoom();
            }else if(operate.equals("alarm")){
                this.alarm();
            }
        }
    }

    public boolean isAlarm(){
        return  true;
    }


    public void setSequences(List<String> sequences) {
        this.sequences = sequences;
    }
}
