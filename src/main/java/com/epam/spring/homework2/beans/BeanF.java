package com.epam.spring.homework2.beans;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
public class BeanF {
    String name;
    String value;

    @Override
    public String toString() {
        return "BeanF{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
