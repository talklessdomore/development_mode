package cn.linc.development.commondModel.demo1;

/**
 * 命令抽象类
 */
public abstract class Command {

    CodeGroup codeGroup = new CodeGroup();

    PageGroup pageGroup = new PageGroup();

    RequirmentGroup requirmentGroup = new RequirmentGroup();

    public abstract void execute();


}
