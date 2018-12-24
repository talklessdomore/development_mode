package cn.linc.development.statusModel;

/**
 * 描述:
 * 打开状态
 *
 * @author xiechenglin
 * @create 2018-12-24 21:18
 */
public  class OpenState extends LiftState{

    @Override
    public void open() {
        super.context.setLiftState(Context.openState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
