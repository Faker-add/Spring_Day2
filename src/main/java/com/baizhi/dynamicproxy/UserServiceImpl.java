package com.baizhi.dynamicproxy;

import com.baizhi.anonation.XingXing;

//原始类
public class UserServiceImpl implements  UserService {
   //原始方法
    @Override
    public void register() {
        //核心功能
        System.out.println("我是没有参数的注册方法");
    }

    @Override
    public void register(String username) {
        System.out.println("我是带有一个参数的注册方法");
    }

    @Override
    @XingXing
    public void register(String username, String password) {
        System.out.println("我是带有两个参数的注册方法");
    }

    @Override
    @XingXing
    public void delete() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用删除的DAO");
    }




}
