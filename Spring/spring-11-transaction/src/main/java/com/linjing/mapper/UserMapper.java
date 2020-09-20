package com.linjing.mapper;

import com.linjing.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser();

    int addUser(User u);

    int deleteUser(int id);
}
