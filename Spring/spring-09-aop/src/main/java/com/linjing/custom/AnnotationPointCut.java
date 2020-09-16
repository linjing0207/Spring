package com.linjing.custom;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//方式三：使用注解实现aop

//标注这个类是一个切面
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.linjing.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.linjing.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("=====方法执行后=====");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.linjing.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前：");

        //获得签名
        System.out.println("签名：" + joinPoint.getSignature());
        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后：");
        System.out.println(proceed);
    }
}
