package cn.linc.development.observerModel.demo1;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-22 13:50
 */
public class Client {

    public static void main(String[] args) {

        Hanfeizi hanfeizi = new Hanfeizi();
        Lisi lisi = new Lisi();
        hanfeizi.addObserver(lisi);
        hanfeizi.breakfast();





    }


}
