package cn.linc.development.factoryMethod.demo2;

/**
 * 白色人种
 */
public class White implements Human {

    public void getColor() {
        System.out.println("欧美人的肤色是白色的");
    }

    public void talk() {
        System.out.println("他们讲的是英文");
    }
}
