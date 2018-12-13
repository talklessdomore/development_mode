package cn.linc.development.adaptorModel;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:
 * 外部员工
 *
 * @author xiechenglin
 * @create 2018-12-13 21:19
 */
public class OuterUser implements OuterUserInfo{

    public Map<String, String> getUserBaseInfo() {
        Map<String,String> map = new HashMap();
        map.put("userName","我的名字");
        return map;
    }

    public Map<String, String> getUserHomeInfo() {
        Map<String,String> map = new HashMap();
        map.put("address","我的地址");
        return map;
    }

    public Map<String, String> getUserOfficeInfo() {
        Map<String,String> map = new HashMap();
        map.put("office","我的办公室");
        return map;
    }
}
