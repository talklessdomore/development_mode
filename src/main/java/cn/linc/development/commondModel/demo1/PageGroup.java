package cn.linc.development.commondModel.demo1;

public class PageGroup extends Group{

    @Override
    public void find() {
        System.out.println("前端组");
    }

    @Override
    public void add() {
        System.out.println("添加页面");
    }

    @Override
    public void change() {
        System.out.println("修改页面");
    }

    @Override
    public void delete() {
        System.out.println("删除页面");
    }

    @Override
    public void plan() {
        System.out.println("一份计划");
    }
}
