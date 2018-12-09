package cn.linc.development.commondModel.demo1;

public class CodeGroup extends Group{

    @Override
    public void find() {
        System.out.println("代码组");
    }

    @Override
    public void add() {
        System.out.println("添加代码");
    }

    @Override
    public void change() {
        System.out.println("修改代码");
    }

    @Override
    public void delete() {
        System.out.println("shanchu代码");
    }

    @Override
    public void plan() {
        System.out.println("一份计划");
    }
}
