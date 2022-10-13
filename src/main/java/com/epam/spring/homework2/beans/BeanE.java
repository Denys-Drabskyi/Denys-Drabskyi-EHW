package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanE extends MyBean{

    public BeanE(int value) {
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
