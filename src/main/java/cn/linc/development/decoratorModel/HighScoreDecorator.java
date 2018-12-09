package cn.linc.development.decoratorModel;

/**
 * 描述:
 * 高成绩修饰类
 *
 * @author xiechenglin
 * @create 2018-12-09 22:18
 */
public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport schoolReport){
        super(schoolReport);
    }

    public void highScore(){
        System.out.println("我成绩189");
    }

    @Override
    public void report() {
        highScore();
        super.report();
    }
}
