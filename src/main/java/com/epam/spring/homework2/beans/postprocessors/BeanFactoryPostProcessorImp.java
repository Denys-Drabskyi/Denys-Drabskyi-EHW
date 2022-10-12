package com.epam.spring.homework2.beans.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanFactoryPostProcessorImp implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String methodName = configurableListableBeanFactory.getBeanDefinition("beanB").getInitMethodName();
        System.out.println("BeanB " + methodName  + " init method changing to init2 method");
        configurableListableBeanFactory.getBeanDefinition("beanB").setInitMethodName("anotherInit");
    }
}
