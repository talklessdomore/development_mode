package cn.linc.development.componentModel;

import java.util.ArrayList;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-19 20:58
 */
public class Client {

    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setGender("nv");
        branch.setName("xiexie");
        Leaf leaf = new Leaf();
        leaf.setGender("nan");
        leaf.setName("ddd");
        branch.add(leaf);
        ArrayList<IGroup> iGroups = branch.getOdinateInfo();
        for (IGroup iGroup:iGroups){
            System.out.println(iGroup.getInfo());
        }




    }


}
