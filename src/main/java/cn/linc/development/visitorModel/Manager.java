package cn.linc.development.visitorModel;

/**
 * 描述:
 * 经理
 *
 * @author xiechenglin
 * @create 2018-12-23 20:58
 */
public class Manager extends Employee{

    @Override
    public void acceptVisitor(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
