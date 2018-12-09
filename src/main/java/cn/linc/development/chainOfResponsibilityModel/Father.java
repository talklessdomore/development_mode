package cn.linc.development.chainOfResponsibilityModel;

/**
 * 描述:
 * 父亲处理类
 *
 * @author xiechenglin
 * @create 2018-12-08 16:54
 */
public class Father extends Handler{


    public Father(){
        super(1);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("开始请示");
        System.out.println(woman.getRequest());
        System.out.println("ok");

    }
}
