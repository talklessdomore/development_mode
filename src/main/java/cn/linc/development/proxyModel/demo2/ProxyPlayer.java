package cn.linc.development.proxyModel.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPlayer implements InvocationHandler {

    private IGamePlayer target;

    public ProxyPlayer(IGamePlayer target){
        this.target = target;
    }

    public <T> T getProxyInstance(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置通知");
        Object obj = method.invoke(target,args);
        System.out.println("后置通知");
        return obj;
    }
}
