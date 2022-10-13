package com.epam.spring.homework2.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
@Qualifier("test")
public class BeanF extends MyBean{

    public BeanF(int value) {
        super(value);
    }
}
