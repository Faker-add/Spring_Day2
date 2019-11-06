package com.baizhi.service;

//代理类
public class UserProxyServiceImpl implements  UserService {
    @Override
    public void register() {
        //额外功能
        System.out.println("----事务888-----");
        //调用原始类中的方法
        UserService userService=new  UserServiceImpl();
        userService.register();
    }

    @Override
    public void delete() {
        //额外功能
        System.out.println("----事务888-----");
        //调用原始类中的方法
        UserService userService=new  UserServiceImpl();
        userService.delete();
    }

    @Override
    public void update() {
        //额外功能
        System.out.println("----事务888-----");
        //调用原始类中的方法
        UserService userService=new  UserServiceImpl();
        userService.update();
    }
}
