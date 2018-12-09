package cn.linc.development.commondModel.demo1;

public class RequirmentGroup extends Group{

    @Override
    public void find() {
        System.out.println("需求组");
    }

    @Override
    public void add() {
        System.out.println("添加需求");
    }

    @Override
    public void change() {
        System.out.println("修改需求");
    }

    @Override
    public void delete() {
        System.out.println("删除需求");
    }

    @Override
    public void plan() {
        System.out.println("一份计划");
    }
}
