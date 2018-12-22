package cn.linc.development.observerModel.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述:
 * 韩非子
 *
 * @author xiechenglin
 * @create 2018-12-22 13:32
 */
public class Hanfeizi implements IHanfeizi,Observabel{

    List<Observer> observers = new ArrayList<Observer>();

    public void breakfast() {
        System.out.println("吃早饭");
        notifyObserverbel("吃早饭");
    }

    public void havafun() {
        System.out.println("娱乐");
        notifyObserverbel("娱乐");
    }

    public void addObserverbel(Observer observer) {
        observers.add(observer);
    }

    public void removeObserverbel(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserverbel(String context) {
        if(observers.size()>0){
            for (Observer observer : observers){
                observer.update(context);
            }
        }
    }
}
