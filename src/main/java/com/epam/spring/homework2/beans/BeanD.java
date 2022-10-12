package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanD {
    String name;
    String value;

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
