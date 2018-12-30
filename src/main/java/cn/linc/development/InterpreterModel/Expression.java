package cn.linc.development.InterpreterModel;

import java.util.HashMap;

/**
 * 描述:
 * 顶层表达式解析
 *
 * @author xiechenglin
 * @create 2018-12-30 14:34
 */
public abstract class Expression {

    public abstract Integer interpreter(HashMap<String,Integer> vars);

}
