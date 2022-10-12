package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Qualifier("test")
public class BeanE extends MyBean{

    public BeanE(@Autowired int value) {
        super(value);
    }

    @PostConstruct
    private void postConstruct (){
        System.out.println("BeanE PostConstruct");
    }

    @PreDestroy
    private void PreDestroy (){
        System.out.println("BeanE PreDestroy");
    }

}
