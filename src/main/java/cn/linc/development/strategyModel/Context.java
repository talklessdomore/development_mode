package cn.linc.development.strategyModel;

/**
 * 描述:
 * 锦囊类
 *
 * @author xiechenglin
 * @create 2018-12-10 21:06
 */
public class Context {

    private IStrategy iStrategy;

    public Context(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

    public void operator(){
        this.iStrategy.operate();
    }



}
