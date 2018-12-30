package cn.linc.development.InterpreterModel;

import java.util.HashMap;

/**
 * 描述:
 * 环境类
 *
 * @author xiechenglin
 * @create 2018-12-30 15:23
 */
public class Client {

    public static void main(String[] args) {
        HashMap<String,Integer> vars = new HashMap<String, Integer>();
        vars.put("a",1);
        vars.put("b",2);
        vars.put("c",3);
        Caculator caculator = new Caculator("a+b-c");
        Integer out = caculator.run(vars);
        System.out.println(out);



    }


}
