package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    String name;
    String value;

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
