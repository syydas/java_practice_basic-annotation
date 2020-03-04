package com.thoughtworks.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 为Student类添加一个Alias注解, 表明Student类可以取一个自定义的别名
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Alias {
    String name() default "";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Limit {
    int min() default 0;

    int max() default 0;
}

@Alias(name = "自定义")
public class Student {
    // 为age字段添加一个Limit注解, 表明age字段的最小值为1 最大值为140
    @Limit(min = 1, max = 140)
    private int age;
}
