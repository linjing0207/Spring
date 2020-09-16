package com.linjing.dao;

public class UserDaoMySQLImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("MySQL获取用户的数据");
    }
}
