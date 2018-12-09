package cn.linc.development.proxyModel.demo2;

public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new ProxyPlayer(new GamePlayer()).getProxyInstance();
        gamePlayer.upgrade();

    }

}
