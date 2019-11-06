package com.baizhi.test;

import com.baizhi.entity.User;
import com.baizhi.service.LandProxyServiceImpl;
import com.baizhi.service.LandService;
import com.baizhi.service.UserProxyServiceImpl;
import com.baizhi.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public  void   test1(){
        ApplicationContext ac= new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User) ac.getBean("user");
        System.out.println(user);
       /* Order order=(Order) ac.getBean("order");
        System.out.println(order);*/
    }

    @Test
    public  void  test2(){
        //创建中介对象
        LandService ls= new LandProxyServiceImpl();
        ls.land();
    }

    @Test
    public  void   test3(){
        UserService userService= new UserProxyServiceImpl();
        userService.register();
        userService.delete();
        userService.update();
    }
    //测试动态代理
    @Test
    public  void  test4(){
        //获取到代理类对象   通过原始类的ID获取到代理类的对象
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");
        userService.register();

    }

}
