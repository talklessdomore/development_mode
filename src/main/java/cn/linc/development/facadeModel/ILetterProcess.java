package cn.linc.development.facadeModel;

/**
 * 描述:
 * 写信接口
 *
 * @author xiechenglin
 * @create 2018-12-22 14:14
 */
public interface ILetterProcess {

    /**
     * 写内容
     */
    public void writeContext(String context);

    /**
     * 写地址
     */
    public void writeAddress(String address);

    /**
     * 装信封
     */
    public void fillEnvelop();

    /**
     * 发送
     */
    public void sendLetter();





}
