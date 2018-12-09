package cn.linc.development.decoratorModel;

/**
 * 描述:
 * 装饰类
 *
 * @author xiechenglin
 * @create 2018-12-09 22:05
 */
public class Decorator extends SchoolReport{

    /**
     * 这个装饰类主要是确定装饰的构造方法以及可以装饰的方法。
     */

    SchoolReport schoolReport = null;

    public Decorator(SchoolReport schoolReport){
        this.schoolReport = schoolReport;
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }
}
