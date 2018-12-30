package cn.linc.development.flyweightModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-30 16:43
 */
public class Client {

    public static void main(String[] args) {
        String key1 = "wallet";
        String key2 = "money";
        for(int i =0 ;i<100 ;i++){
           SignInfo signInfo = SignInfoFactory.getSignInfo(key1);
           signInfo.setName("zs"+i);
           signInfo.setAddress("dd"+i);
            System.out.println(signInfo);
        }
    }

}
