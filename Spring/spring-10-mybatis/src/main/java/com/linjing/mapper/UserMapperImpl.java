package com.linjing.mapper;

import com.linjing.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

//UserMapper的实现类
public class UserMapperImpl implements UserMapper{

    //我们所有的操作，在mybatis里都是用sqlSession来执行；
    //现在整合进spring，使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    //注入sqlSession
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
