package cn.linc.development.adaptorModel;

/**
 * 描述:
 * 适配类
 *
 * @author xiechenglin
 * @create 2018-12-13 21:22
 */
public class OuterUserInfoAdaptor extends OuterUser implements IUserInfo{

    public String getUserName() {
        System.out.println(super.getUserBaseInfo().get("userName"));
        return null;
    }

    public String getAddress() {
        System.out.println(super.getUserHomeInfo().get("address"));
        return null;
    }
}
