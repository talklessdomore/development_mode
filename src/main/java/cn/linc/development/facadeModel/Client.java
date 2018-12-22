package cn.linc.development.facadeModel;

/**
 * 描述:
 * 场景类
 *
 * @author xiechenglin
 * @create 2018-12-22 14:19
 */
public class Client {

    public static void main(String[] args) {
        Post post = new Post();
        post.sendLetter("刘亦菲","上海");
    }

}
