package cn.linc.development.visitorModel;

/**
 * 描述:
 * 雇佣者
 *
 * @author xiechenglin
 * @create 2018-12-23 20:53
 */
public abstract class Employee {

    private String name;

    private String sex;

    public abstract void acceptVisitor(IVisitor iVisitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
