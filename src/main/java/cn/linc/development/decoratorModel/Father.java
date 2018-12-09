package cn.linc.development.decoratorModel;

/**
 * 描述:
 * 看成绩单类
 *
 * @author xiechenglin
 * @create 2018-12-09 22:25
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new ForthGradeReport();
        Decorator decorator = new HighScoreDecorator(schoolReport);
        decorator.report();


    }



}
