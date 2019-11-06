package com.baizhi.dynamicproxy;

import com.baizhi.anonation.XingXing;

//原始类
public class OrderServiceImpl  implements OrderService {
    @Override
    @XingXing
    public void register(String username) {
        System.out.println("我是OrderServiceImpl类中的注册方法");
    }
}
