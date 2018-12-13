package cn.linc.development.adaptorModel;

/**
 * 描述:
 * 员工信息实现类
 *
 * @author xiechenglin
 * @create 2018-12-13 21:16
 */
public class UserInfo implements IUserInfo{

    public String getUserName() {
        System.out.println("我的名字");
        return null;
    }

    public String getAddress() {
        System.out.println("我的地址");
        return null;
    }
}
