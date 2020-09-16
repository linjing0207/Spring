package com.linjing.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    //method: 要执行的目标对象的方法
    //args: 参数
    //target: 目标对象
    //这个方法会在我们执行方法之前，自动调用
    public void before(Method method, Object[] args, Object target) throws Throwable {
        //什么类的什么方法被执行了
        System.out.println(target.getClass().getName() + "的什么" + method.getName() + "被执行了");
    }
}
