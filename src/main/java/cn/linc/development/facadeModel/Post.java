package cn.linc.development.facadeModel;

/**
 * 描述:
 * 邮局
 *
 * @author xiechenglin
 * @create 2018-12-22 14:15
 */
public class Post {

    ILetterProcess letterProcess = new LetterProcess();

    Police police = new Police();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.writeAddress(address);
        letterProcess.fillEnvelop();
        police.check();
        letterProcess.sendLetter();
    }



}
