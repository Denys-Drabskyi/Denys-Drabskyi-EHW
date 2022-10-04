package com.epam.spring.homework1;

import com.epam.spring.homework1.config.BeansConfig;
import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfig.class);
        applicationContext.getBean(Pet.class).printPets();
        System.out.println(applicationContext.getBean(Cheetah.class).hashCode());
        System.out.println(applicationContext.getBean("test1"));
        System.out.println(applicationContext.getBean("test2"));
        System.out.println(applicationContext.getBean("test").hashCode());



    }
}
