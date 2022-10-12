package com.epam.spring.homework2.config;

import com.epam.spring.homework2.beans.*;
import com.epam.spring.homework2.beans.postprocessors.BeanFactoryPostProcessorImp;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.*;
import java.util.Random;

@Configuration
@Import(OtherConfig.class)
@ComponentScan(basePackages = {"com.epam.spring.homework2.beans"})
@PropertySource("classpath:my.properties")
public class BeansConfig {
    private final Random random = new Random();

    @Bean
    @Scope("prototype")
    int value (){
        return random.nextInt(100);
    }

    @Bean (initMethod = "init",destroyMethod = "destroy")
    BeanD beanD (@Value("${beanD-name}") String name, @Value("${beanD-value}") int value){
        return new BeanD(name,value);
    }

    @Bean (initMethod = "init",destroyMethod = "destroy")
    @DependsOn("beanD")
    BeanB beanB (@Value("${beanB-name}") String name, @Value("${beanB-value}") int value){
        return new BeanB(name,value);
    }

    @Bean (initMethod = "init",destroyMethod = "destroy")
    @DependsOn("beanB")
    BeanC beanC (@Value("${beanC-name}") String name, @Value("${beanC-value}") int value){
        return new BeanC(name,value);
    }
}
