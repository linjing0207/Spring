package com.linjing.config;

import com.linjing.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//@Configuration这个也会被spring容器接管，注册到容器中，它本身就是一个@Component
//@Configuration代表这是一个配置类，和我们之前的beans.xml一样
@Configuration
@ComponentScan("com.linjing.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    //注册一个bean，等价于xml里的bean标签
    //这个方法的名字，相当于bean标签中的id属性
    //方法的返回值，相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); //就是返回要注入到bean的对象
    }
}
