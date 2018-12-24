package cn.linc.development.visitorModel;

import java.util.ArrayList;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-23 21:05
 */
public class Client {

    public static void main(String[] args) {
        Employee commonEmplyee = new CommonEmployer();
        Employee manager = new Manager();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(commonEmplyee);
        employees.add(manager);
        for (Employee employee : employees){
            employee.acceptVisitor(new Visitor());
        }

    }


}
