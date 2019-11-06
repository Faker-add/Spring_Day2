package com.baizhi.service;

//中介  代理类
public class LandProxyServiceImpl implements LandService {
    @Override
    public void land() {
        //额外功能
        System.out.println("打广告");
        System.out.println("看房子");
        System.out.println("一条龙服务");
        //调用房东的核心方法
        LandService ls=new  LandloadServiceImpl();
        ls.land();
    }
}
