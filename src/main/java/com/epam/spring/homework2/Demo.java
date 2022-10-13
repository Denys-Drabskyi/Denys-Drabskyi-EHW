package com.epam.spring.homework2;

import com.epam.spring.homework2.beans.BeanA;
import com.epam.spring.homework2.beans.BeanE;
import com.epam.spring.homework2.beans.BeanF;
import com.epam.spring.homework2.beans.MyBean;
import com.epam.spring.homework2.beans.postprocessors.BeanFactoryPostProcessorImp;
import com.epam.spring.homework2.config.BeansConfig;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public record Demo(List<MyBean> beans) {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);

        System.out.println("Bean configs:");
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(d -> System.out.println(applicationContext.getBeanDefinition(d)));
        System.out.println(
                applicationContext.getBean(BeanA.class).toString() +
                        applicationContext.getBean(BeanE.class) +
                        applicationContext.getBean(BeanF.class)
        );

        BeanFactoryPostProcessor processor = applicationContext.getBean(BeanFactoryPostProcessorImp.class);
        applicationContext.addBeanFactoryPostProcessor(processor);
    }
}
