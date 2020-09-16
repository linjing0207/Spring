package com.linjing.demo04;

import com.linjing.demo02.UserService;
import com.linjing.demo02.UserServiceImpl;
import com.linjing.demo02.UserServiceImpl2;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl2();

        //代理角色：不存在;创建调用处理程序。
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //1. 设置要代理的对象（真实角色）
        pih.setTarget(userService);
        //2. 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        //3.代理类执行操作
        proxy.add();
    }
}
