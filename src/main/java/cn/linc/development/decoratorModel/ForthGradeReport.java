package cn.linc.development.decoratorModel;

/**
 * 描述:
 * 四年级成绩单
 *
 * @author xiechenglin
 * @create 2018-12-09 22:03
 */
public class ForthGradeReport extends SchoolReport{

    @Override
    public void sign(String name) {
        System.out.println("签名："+name);
    }

    @Override
    public void report() {
        System.out.println("成绩：185，第二名");
    }
}
