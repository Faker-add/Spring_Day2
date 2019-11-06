package com.baizhi.test;

import com.baizhi.dynamicproxy.OrderService;
import com.baizhi.dynamicproxy.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProxy {
    @Test
    public  void   test1(){
        //获取到代理类对象   通过原始类的ID获取到代理类的对象
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");
        System.out.println(userService.getClass());
        userService.register();
        userService.delete();
        userService.register("小黑");
        userService.register("小黑","123456");
    }

    @Test
    public  void   test2(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        com.baizhi.test.UserService userService=(com.baizhi.test.UserService)ac.getBean("userService2");
        userService.register("小白");
    }

    @Test
    public  void   test3(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService=(OrderService) ac.getBean("orderService");
        orderService.register("小白");
    }
}
