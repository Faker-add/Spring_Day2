package com.baizhi.beanprocessor;

import com.baizhi.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor  implements BeanPostProcessor {

    //调用初始化方法之前执行                         bean代表对象
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override                                 //获取原始对象
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
     //如果是User类型再做加工
       if (bean.getClass()==User.class){
           User user=(User)bean;
           user.setId("666");
           user.setUsername("小三");
           user.setPassword("123456");
           System.out.println(beanName);
           return  user;
       }else {
           return  bean;
       }
    }
}
