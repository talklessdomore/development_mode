package cn.linc.development.visitorModel;

/**
 * 描述:
 * 访问者
 *
 * @author xiechenglin
 * @create 2018-12-23 20:55
 */
public class Visitor implements IVisitor{

    public void visit(CommonEmployer commonEmployer) {
        System.out.println("这是普通员工报表");
    }

    public void visit(Manager manager) {
        System.out.println("这是管理者报表");
    }
}
