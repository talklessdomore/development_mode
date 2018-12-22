package cn.linc.development.observerModel.demo1;

import java.util.Observable;

/**
 * 描述:
 * 韩非子
 *
 * @author xiechenglin
 * @create 2018-12-22 13:43
 */
public class Hanfeizi extends Observable implements IHanfeizi {

    public void breakfast() {
        System.out.println("吃早饭");
        super.setChanged();
        super.notifyObservers("吃早饭");

    }

    public void havafun() {
        System.out.println("娱乐");
        super.setChanged();
        super.notifyObservers("娱乐");
    }
}
