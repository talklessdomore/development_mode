package cn.linc.development.componentModel;

import java.util.ArrayList;

/**
 * 描述:
 * 分支实现类
 *
 * @author xiechenglin
 * @create 2018-12-19 20:55
 */
public class Branch implements IBranch{

    private String name;

    private String gender;

    ArrayList group = new ArrayList();

    public void add(IGroup iGroup) {
        group.add(iGroup);
    }

    public ArrayList<IGroup> getOdinateInfo() {
        return group;
    }

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
