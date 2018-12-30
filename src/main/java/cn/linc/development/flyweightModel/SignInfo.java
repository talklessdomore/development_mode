package cn.linc.development.flyweightModel;

/**
 * 描述:
 * 签名信息
 *
 * @author xiechenglin
 * @create 2018-12-30 16:36
 */
public class SignInfo {

    private String name;

    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
