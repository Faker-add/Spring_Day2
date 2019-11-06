package com.baizhi.dynamicproxy;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//额外功能类
public class Before implements MethodBeforeAdvice {
    /*
     *
     * 方法作用:书写额外功能
     *
     *
     * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("我是原始方法执行之前执行的额外功能8888888");
    }
}
