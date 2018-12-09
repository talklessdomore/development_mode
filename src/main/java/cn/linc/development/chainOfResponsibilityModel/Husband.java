package cn.linc.development.chainOfResponsibilityModel;

/**
 * 描述:
 * 丈夫处理类
 *
 * @author xiechenglin
 * @create 2018-12-08 17:01
 */
public class Husband extends Handler{

    public Husband(){
        super(2);
    }


    @Override
    protected void response(IWoman woman) {
        System.out.println("女孩请求");
        System.out.println(woman.getRequest());
        System.out.println("别买包包");

    }
}
