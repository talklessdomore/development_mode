package cn.linc.development.InterpreterModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * 描述:
 * 计算类
 *
 * @author xiechenglin
 * @create 2018-12-30 14:42
 */
public class Caculator {

    private Expression expression;

    public Caculator(String exp){
        char[] vars =  exp.toCharArray();
        Stack<Expression> stack = new Stack<Expression>();
        Expression left;
        Expression right;
        for (int i = 0; i<vars.length; i++){
            switch (vars[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(vars[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(vars[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(vars[i])));
            }
        }
        expression = stack.pop();
    }

    public Integer run(HashMap<String,Integer> values){
        return expression.interpreter(values);
    }

}
