package com.linjing.pojo;

public class Student {
    private String name;

    public Student() {
        System.out.println("student的无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name:" + name);
    }
}
