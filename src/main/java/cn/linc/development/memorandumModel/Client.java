package cn.linc.development.memorandumModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-22 15:35
 */
public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setStatus("现在的心情很好");
        System.out.println(boy.toString());
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println(boy.toString());
        boy.restoreMemento(careTaker.getMemento());
        System.out.println(boy.toString());


    }


}
