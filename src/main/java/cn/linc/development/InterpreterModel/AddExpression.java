package cn.linc.development.InterpreterModel;

import java.util.HashMap;

/**
 * 描述:
 * 加法解析器
 *
 * @author xiechenglin
 * @create 2018-12-30 14:38
 */
public class AddExpression extends SymbolExpression{

    public AddExpression(Expression left,Expression right){
        super(left,right);
    }

    @Override
    public Integer interpreter(HashMap<String, Integer> vars) {
        int a = super.left.interpreter(vars);
        int b = super.right.interpreter(vars);
        return  a+b ;
    }
}
