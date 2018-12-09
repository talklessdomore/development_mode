package cn.linc.development.factoryMethod.delayFactory;

import java.util.HashMap;
import java.util.Map;

public class DelayFactory {

    public static final Map<String,Object> objMap = new HashMap();

    public static synchronized Object getObject(String key){
        Object obj = null;
        if(objMap.containsKey(key)){
            return objMap.get(key);
        }else{
            if(key.equals("jj")){
                obj = new Object();
                return obj;
            }else {

            }
            objMap.put(key,obj);
        }
        return null;
    }


}
