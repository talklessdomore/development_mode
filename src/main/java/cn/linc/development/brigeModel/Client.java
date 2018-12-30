package cn.linc.development.brigeModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-30 17:17
 */
public class Client {

    public static void main(String[] args) {
        Product product = new House();
        Crop crop = new HouseCrop(product);
        crop.makeMoney();



    }


}
