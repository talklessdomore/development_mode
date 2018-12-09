package cn.linc.development.chainOfResponsibilityModel;

/**
 * 描述:
 * 女孩实现类
 *
 * @author xiechenglin
 * @create 2018-12-08 16:42
 */
public class Woman extends IWoman{

    private int type = 0;

    private String request;

    public Woman(int type,String request){
        this.type = type;
        this.request = request;
        switch (type){
            case 1:
                this.request="女儿的请求是"+this.request;
                break;
            case 2:
                this.request="老婆的请求是"+this.request;
                break;
            case 3:
                this.request="老娘的请求是"+this.request;
                break;
        }
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
