package cn.linc.development.chainOfResponsibilityModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-08 16:58
 */
public class Client {

    public static void main(String[] args) {
        IWoman woman = new Woman(2,"出去逛街");
        Handler father = new Father();
        father.setNext(new Husband());
        father.handMessage(woman);

    }



}
