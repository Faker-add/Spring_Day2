package com.baizhi.service;

//原始类
public class UserServiceImpl implements  UserService {
    @Override
    public void register() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用注册DAO");
    }

    @Override
    public void delete() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用删除的DAO");
    }

    @Override
    public void update() {
        //核心功能
        System.out.println("处理业务的逻辑代码");
        System.out.println("调用修改的DAO");
    }
}
