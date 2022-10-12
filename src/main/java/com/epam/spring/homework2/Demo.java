package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.MyBean;
import com.epam.spring.homework2.beans.postprocessors.BeanFactoryPostProcessorImp;
import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Demo {

    private final List<MyBean> beans;


    public Demo(@Autowired List<MyBean> beans) {
        this.beans = beans;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);

        System.out.println("Bean configs:");
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(d -> System.out.println(applicationContext.getBeanDefinition(d)));
        System.out.println();


        BeanFactoryPostProcessor processor = applicationContext.getBean(BeanFactoryPostProcessor.class);
        applicationContext.addBeanFactoryPostProcessor(processor);
        applicationContext.refresh();

     }
}
