package cn.linc.development.InterpreterModel;

/**
 * 描述:
 * 符号解析器
 *
 * @author xiechenglin
 * @create 2018-12-30 14:37
 */
public abstract class SymbolExpression extends Expression{

    public Expression left;

    public Expression right;

    public SymbolExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

}
