package com.linjing.service;

import com.linjing.dao.UserDao;

public class UserServiceImpl implements UserService{
    private UserDao userDao;

    //利用set进行动态实现值的注入。
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser(); //业务层调dao层
    }
}
