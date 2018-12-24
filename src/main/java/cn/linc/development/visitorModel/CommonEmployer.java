package cn.linc.development.visitorModel;

/**
 * 描述:
 * 普通工人
 *
 * @author xiechenglin
 * @create 2018-12-23 20:56
 */
public class CommonEmployer extends Employee{

    @Override
    public void acceptVisitor(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
