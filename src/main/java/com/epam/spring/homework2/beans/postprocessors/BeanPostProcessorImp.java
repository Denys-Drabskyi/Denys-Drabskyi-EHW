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
        if (bean instanceof MyBean myBean){
            if(isValid(myBean)){
                System.out.println(beanName+" is valid");
            } else throw new RuntimeException(beanName+" is not valid");

        }
        return bean;
    }

    private boolean isValid(MyBean myBean) {
        return myBean.getName() != null && myBean.getValue() > 0;
    }
}
