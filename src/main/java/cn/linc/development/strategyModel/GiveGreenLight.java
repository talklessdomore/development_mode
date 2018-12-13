package cn.linc.development.strategyModel;

/**
 * 描述:
 * 开绿灯
 *
 * @author xiechenglin
 * @create 2018-12-10 21:04
 */
public class GiveGreenLight implements IStrategy{

    public void operate() {
        System.out.println("开绿灯");
    }
}
