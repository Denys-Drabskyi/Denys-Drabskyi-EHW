package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn({"beanD","beanB","beanC"})
public class BeanA extends MyBean implements InitializingBean, DisposableBean {

    public BeanA(int value) {
        super(value);
    }

    @Override
    public void destroy(){
        System.out.println("BeanA destroy");
    }

    @Override
    public void afterPropertiesSet(){
        System.out.println("BeanA afterPropertiesSet");
    }
}
