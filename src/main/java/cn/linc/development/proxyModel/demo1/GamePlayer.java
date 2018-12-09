package cn.linc.development.proxyModel.demo1;

public class GamePlayer implements IGamePlayer{

    public void login(String userName, String password) {
        System.out.println("登录"+userName+","+password);
    }

    public void killBoos() {
        System.out.println("打老怪");
    }

    public void upgrade() {
        System.out.println("升级");
    }
}
