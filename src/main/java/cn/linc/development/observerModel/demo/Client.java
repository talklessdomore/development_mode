package cn.linc.development.observerModel.demo;


/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-22 13:35
 */
public class Client {

    public static void main(String[] args) {
        Zs zs = new Zs();
        Hanfeizi hanfeizi = new Hanfeizi();
        hanfeizi.addObserverbel(zs);
        hanfeizi.havafun();
    }

}
