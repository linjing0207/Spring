package com.linjing.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色（房东），实现了Lease接口
        Landlord landlord = new Landlord();

        //代理角色：现在没有

        //代理调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过  调用程序处理角色 来我们要调用的接口对象
        pih.setLease(landlord);
        //返回代理类实例
        Lease proxy = (Lease) pih.getProxy(); //这里的Proxy就是动态生成的，我们并没有写
        proxy.lease();
    }
}
