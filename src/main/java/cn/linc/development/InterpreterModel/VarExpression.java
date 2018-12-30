package cn.linc.development.InterpreterModel;

import java.util.HashMap;

/**
 * 描述:
 * 参数解析
 *
 * @author xiechenglin
 * @create 2018-12-30 14:35
 */
public class VarExpression extends Expression{

    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    @Override
    public Integer interpreter(HashMap<String, Integer> vars) {
        return vars.get(key);
    }
}
