package com.linjing.mapper;

import com.linjing.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//UserMapper的实现类:用SqlSessionDaoSupport实现
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {
        User user = new User(8, "shrily", "123");
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        mapper.addUser(user);
        mapper.deleteUser(6); //sql故意写错，让其不成功。

        return mapper.selectUser();
    }

    public int addUser(User u) {
        return getSqlSession().getMapper(UserMapper.class).addUser(u);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
