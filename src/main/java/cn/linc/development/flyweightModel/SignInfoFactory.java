package cn.linc.development.flyweightModel;

import java.util.HashMap;
import java.util.Random;

/**
 * 描述:
 * 工厂类
 *
 * @author xiechenglin
 * @create 2018-12-30 16:37
 */
public class SignInfoFactory {

    public static   SignInfo getSignInfo(String key) {
        HashMap<String,SignInfo> pool = new HashMap<String, SignInfo>();
        SignInfo signInfo = null;
        if(pool.get(key)!=null){
            signInfo = pool.get(key);
        }else {
            signInfo = new SignInfo();
            pool.put(key,signInfo);
        }
        return signInfo;
    }


}
