package cn.linc.development.factoryMethod.demo1;



/**
 * 简单工厂
 */
public class HumanFactory{

    /**
     * 创建人
     * @param c 创建人的类
     * @param <T>
     * @return
     */
    public static  <T extends Human> T createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println();
        }
        return (T)human;
    }
}
