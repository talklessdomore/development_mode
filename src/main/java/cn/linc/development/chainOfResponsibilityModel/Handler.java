package cn.linc.development.chainOfResponsibilityModel;

/**
 * 描述:
 * 抽象处理类
 *
 * @author xiechenglin
 * @create 2018-12-08 16:46
 */
public abstract class Handler {

    //父亲处理
    public static final Integer LEVEL1 = 1;
    //丈夫处理
    public static final Integer LEVEL2 = 2;
    //儿子处理
    public static final Integer LEVEL3 = 3;
    private int level = 0;

    private Handler nextHandler;

    public Handler(int level){
        this.level = level;
    }

    public void handMessage(IWoman woman){
        if(woman.getType()==level){
            this.response(woman);
        }else{
            if(this.nextHandler!=null){
                this.nextHandler.handMessage(woman);
            }else {
                System.out.println("没地方请示了");
            }
        }

    }





    public void setNext(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    protected abstract void response(IWoman woman);


}
