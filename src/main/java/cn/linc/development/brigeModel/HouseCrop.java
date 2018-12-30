package cn.linc.development.brigeModel;

/**
 * 描述:
 * 房地产公司
 *
 * @author xiechenglin
 * @create 2018-12-30 17:15
 */
public class HouseCrop extends Crop{

    public HouseCrop(Product product){
        super(product);
    }

    @Override
    public void makeMoney() {
        super.product.beProducted();
        super.product.sell();
        System.out.println("房地产挣钱了");
    }
}
