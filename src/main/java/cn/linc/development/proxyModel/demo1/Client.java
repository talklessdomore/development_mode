package cn.linc.development.proxyModel.demo1;

public class Client {

    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer();
        ProxyGamePlayer proxyGamePlayer = new ProxyGamePlayer(gamePlayer);
        gamePlayer.login("zhangsan","222");
        gamePlayer.killBoos();
        gamePlayer.upgrade();

    }


}
