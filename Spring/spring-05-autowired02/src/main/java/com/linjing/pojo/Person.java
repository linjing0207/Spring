package com.linjing.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {

    private String name; //人名

    //如果显式地定义了autowired，required为false，说明这个对象可以为null, 否则不允许为空。
    // @Autowired(required = false)
    @Autowired
    @Qualifier(value = "dog1")
    private Dog dog; //有一只狗

    //@Resource是java的注解，功能强大，效率稍差一些。它会先找byname，然后再bytype去找。
    @Resource(name = "cat2")
    private Cat cat; //有一只猫

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    // public void setDog(Dog dog) {
    //     this.dog = dog;
    // }

    public Cat getCat() {
        return cat;
    }

    // public void setCat(Cat cat) {
    //     this.cat = cat;
    // }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
