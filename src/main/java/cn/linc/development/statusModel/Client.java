package cn.linc.development.statusModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-24 21:48
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new OpenState());
        context.open();

    }


}
