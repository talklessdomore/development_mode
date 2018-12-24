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
        System.out.println("电梯门开启");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeState);
        super.context.close();
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
