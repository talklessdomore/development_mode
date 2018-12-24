package cn.linc.development.statusModel;

/**
 * 描述:
 * 电梯状态
 *
 * @author xiechenglin
 * @create 2018-12-24 21:11
 */
public abstract class LiftState {

    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();

}
