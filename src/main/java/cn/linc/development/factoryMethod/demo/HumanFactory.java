package cn.linc.development.factoryMethod.demo;

/**
 * 创建人的工厂
 */
public class HumanFactory implements AbstractHumanFactory {

    /**
     * 创建人
     * @param c 创建人的类
     * @param <T>
     * @return
     */
    public <T extends Human> T createHuman(Class c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            System.out.println();
        }
        return (T)human;
    }
}
