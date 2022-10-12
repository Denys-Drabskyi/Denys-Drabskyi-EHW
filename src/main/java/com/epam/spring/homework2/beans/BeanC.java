package com.epam.spring.homework2.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanC {
    String name;
    String value;

    @Override
    public String toString() {
        return "BeanC{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    public BeanC() {
        System.out.println(this.getClass().getSimpleName());
    }
}
