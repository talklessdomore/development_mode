package cn.linc.development.visitorModel;

/**
 * 描述:
 * 访问者接口
 *
 * @author xiechenglin
 * @create 2018-12-23 20:52
 */
public interface IVisitor {

    public void visit(CommonEmployer commonEmployer);

    public void visit(Manager manager);

}
