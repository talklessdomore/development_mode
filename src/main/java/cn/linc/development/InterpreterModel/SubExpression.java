package cn.linc.development.InterpreterModel;

import java.util.HashMap;

/**
 * 描述:
 * 加法解析
 *
 * @author xiechenglin
 * @create 2018-12-30 15:11
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left,Expression right){
        super(left,right);
    }

    @Override
    public Integer interpreter(HashMap<String, Integer> vars) {
        return super.left.interpreter(vars) - super.right.interpreter(vars);
    }

}
