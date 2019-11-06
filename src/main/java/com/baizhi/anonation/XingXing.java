package com.baizhi.anonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //指定注解应用在方法上
@Retention(RetentionPolicy.RUNTIME) //该注解在运行时依然有效
public @interface XingXing {
    String  value()   default "星星";
}

/*
*
* RetentionPolicy.SOURCE   注解只在源码中  .java文件中有效
* RetentionPolicy.CLASS    编译为字节码文件 依然有效  .java .class文件
* RetentionPolicy.RUNTIME  运行时依然有效  .java文件 .class 文件 运行依然有效
* */
