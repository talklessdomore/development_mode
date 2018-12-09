package cn.linc.development.commondModel.demo1;

/**
 * 添加代码命令
 */
public class AddCodeCommand extends  Command{

    @Override
    public void execute() {
        super.codeGroup.find();
        super.codeGroup.add();
        super.codeGroup.plan();
    }
}
