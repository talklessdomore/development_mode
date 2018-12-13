package cn.linc.development.strategyModel;

/**
 * 描述:
 * 赵云
 *
 * @author xiechenglin
 * @create 2018-12-10 21:10
 */
public class Zhaoyun {

    public static void main(String[] args) {
        Context context = new Context(new GiveGreenLight());
        context.operator();
        Context context1 = new Context(new BlockEnemy());
        context1.operator();
        Context context2 = new Context(new BackDoor());
        context2.operator();
    }
}
