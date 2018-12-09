package cn.linc.development.commondModel.demo1;

public class Client {

    public static void main(String[] args) {
        AddCodeCommand addCodeCommand = new AddCodeCommand();
        Invoker invoker = new Invoker();
        invoker.setCommand(addCodeCommand);
        invoker.action();
    }


}
