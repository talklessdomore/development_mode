package cn.linc.development.componentModel;

import java.util.ArrayList;

/**
 * 描述:
 * 分支接口
 *
 * @author xiechenglin
 * @create 2018-12-19 20:53
 */
public interface IBranch extends IGroup{

    public void add(IGroup iGroup);

    public ArrayList<IGroup> getOdinateInfo();


}
