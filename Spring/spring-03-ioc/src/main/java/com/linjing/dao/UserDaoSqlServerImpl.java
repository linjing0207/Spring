package com.linjing.dao;

public class UserDaoSqlServerImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SQL SERVER 获取用户的数据");
    }
}
