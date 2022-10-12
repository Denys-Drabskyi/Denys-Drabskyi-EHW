package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanE {
    String name;
    String value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
