package com.epam.spring.homework2.beans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class BeanC extends MyBean{

    public BeanC(String name, int value) {
        super(name, value);
    }

    private void init() {
        System.out.printf("%s, init%n", this.getClass().getSimpleName());
    }

    private void destroy() {
        System.out.printf("%s, destroy%n", this.getClass().getSimpleName());
    }
}
