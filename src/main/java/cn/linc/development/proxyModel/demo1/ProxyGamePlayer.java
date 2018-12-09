package cn.linc.development.proxyModel.demo1;

public class ProxyGamePlayer implements IGamePlayer{

    private GamePlayer gamePlayer ;
    public ProxyGamePlayer(GamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    public void login(String userName, String password) {
        gamePlayer.login(userName,password);
    }

    public void killBoos() {
        gamePlayer.killBoos();
    }

    public void upgrade() {
        gamePlayer.upgrade();
    }
}
