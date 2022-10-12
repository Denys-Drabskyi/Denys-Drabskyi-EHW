package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("test")
public class BeanA extends MyBean implements InitializingBean, DisposableBean {

    public BeanA(@Autowired int value) {
        super(value);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanA destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanA afterPropertiesSet");
    }
}
