package com.linjing.demo02;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
//        UserService userService = new UserServiceImpl2();

        //代理
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService); //set真实对象
        proxy.query();
    }
}
