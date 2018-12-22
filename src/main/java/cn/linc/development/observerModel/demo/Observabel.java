package cn.linc.development.observerModel.demo;

/**
 * 描述:
 * 观察抽象接口
 *
 * @author xiechenglin
 * @create 2018-12-22 13:26
 */
public interface Observabel {

    /**
     * 添加观察者
     */
    public void addObserverbel(Observer observer);

    /**
     * 移除观察者
     */
    public void removeObserverbel(Observer observer);

    /**
     * 提醒观察者
     */
    public void notifyObserverbel(String context);


}
