package cn.linc.development.componentModel;

/**
 * 描述:
 * 叶子节点
 *
 * @author xiechenglin
 * @create 2018-12-19 20:59
 */
public class Leaf implements ILeaf{

    private String name;

    private String gender;

    public String getInfo() {
        return name+","+gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
