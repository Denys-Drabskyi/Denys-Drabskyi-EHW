package com.epam.spring.homework2.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class BeanB extends MyBean{

    public BeanB(String name, int value) {
        super(name, value);
    }

    private void init() {
        System.out.printf("%s, init%n", this.getClass().getSimpleName());
    }

    private void init2() {
        System.out.printf("%s, init2%n", this.getClass().getSimpleName());
    }

    private void destroy() {
        System.out.printf("%s, destroy%n", this.getClass().getSimpleName());
    }
}
