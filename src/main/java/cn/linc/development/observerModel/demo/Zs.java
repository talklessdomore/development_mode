package cn.linc.development.observerModel.demo;

/**
 * 描述:
 * 观察者张三
 *
 * @author xiechenglin
 * @create 2018-12-22 13:30
 */
public class Zs implements Observer{

    public void update(String context) {
        System.out.println("通知："+context);
    }
}
