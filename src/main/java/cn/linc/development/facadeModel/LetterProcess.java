package cn.linc.development.facadeModel;

/**
 * 描述:
 * 信件处理类
 *
 * @author xiechenglin
 * @create 2018-12-22 14:17
 */
public class LetterProcess implements ILetterProcess{

    public void writeContext(String context) {
        System.out.println("写信："+context);
    }

    public void writeAddress(String address) {
        System.out.println("写地址："+address);
    }

    public void fillEnvelop() {
        System.out.println("装信件");
    }

    public void sendLetter() {
        System.out.println("发送");
    }
}
