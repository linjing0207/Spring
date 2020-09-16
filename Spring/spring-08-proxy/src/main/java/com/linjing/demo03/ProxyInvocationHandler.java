package com.linjing.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类，自动生成代理类！
//不写代理累了，只写一个代理类的调用处理程序。
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Lease lease;

    public void setLease(Lease lease) {
        this.lease = lease;
    }

    //生成得到代理类实例
    public Object getProxy(){
        //参数：classLoader, 代理的接口，调用处理程序
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), lease.getClass().getInterfaces(), this);
    }
    //处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        visit();
        //实现接口的方法
        //动态代理的本质：就是使用反射机制实现
        Object result = method.invoke(lease, args);
        signContract();
        charge();
        return result;
    }

    //看房
    public void visit(){
        System.out.println("中介：带你看房。");
    }

    //收中介费
    public void charge(){
        System.out.println("中介：收中介费");
    }

    //签租赁合同
    public void signContract(){
        System.out.println("中介：签合同");
    }
}
