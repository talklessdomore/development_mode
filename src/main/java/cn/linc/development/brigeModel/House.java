package cn.linc.development.brigeModel;

/**
 * 描述:
 * 房子产品
 *
 * @author xiechenglin
 * @create 2018-12-30 17:13
 */
public class House extends Product{

    @Override
    public void beProducted() {
        System.out.println("产出房子");
    }

    @Override
    public void sell() {
        System.out.println("销售房子");
    }
}
