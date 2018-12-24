package cn.linc.development.statusModel;

/**
 * 描述:
 * 环境类
 *
 * @author xiechenglin
 * @create 2018-12-24 21:10
 */
public class Context {

    public final static OpenState openState = new OpenState();

    public final static CloseState closeState = new CloseState();

    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }





}
