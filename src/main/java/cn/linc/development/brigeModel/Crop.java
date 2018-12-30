package cn.linc.development.brigeModel;

/**
 * 描述:
 * 公司抽象
 *
 * @author xiechenglin
 * @create 2018-12-30 17:14
 */
public abstract class Crop {

    public Product product;

    public Crop(Product product){
        this.product = product;
    }

    public abstract void makeMoney();

}
