package cn.linc.development.observerModel.demo1;

import java.util.Observable;
import java.util.Observer;

/**
 * 描述:
 * 李四观察者
 *
 * @author xiechenglin
 * @create 2018-12-22 13:49
 */
public class Lisi implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("通知："+arg.toString());
    }
}
