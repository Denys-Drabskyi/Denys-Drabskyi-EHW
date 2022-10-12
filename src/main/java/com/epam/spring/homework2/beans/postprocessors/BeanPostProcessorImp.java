package com.epam.spring.homework2.beans.postprocessors;

import com.epam.spring.homework2.beans.MyBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class BeanPostProcessorImp implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(!isValid(bean)){
            throw new RuntimeException(beanName+" is not valid");
        }
        System.out.println(beanName+" is valid");
        return bean;
    }

    private boolean isValid(Object bean) {
        MyBean myBean = (MyBean) bean;
        return myBean.getName() != null && myBean.getValue() > 0;
    }
}
