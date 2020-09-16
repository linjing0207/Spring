package com.linjing.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于<bean id="user" class="com.linjing.pojo.User"/>
//@Component 组间

@Component
@Scope("singleton")
public class User {

    public String name;

    //相当于bean里的property:<property name="name" value="小猪佩奇">
    @Value("小猪佩奇")
    public void setName(String name) {
        this.name = name;
    }
}
