package com.epam.spring.homework1.config;

import com.epam.spring.homework1.pet.Cheetah;
import com.epam.spring.homework1.pet.Spider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.epam.spring.homework1.pet"},excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = Spider.class))
public class PetConfig {
    @Bean
    @Primary
    public Cheetah cheetah1 (){
        return new Cheetah();
    }

    @Bean ("test")
    public Cheetah cheetah2 (){
        return new Cheetah();
    }

    @Bean
    public int test1 (Cheetah cheetah) {
        return cheetah.hashCode();
    }

    @Bean
    public int test2 (@Qualifier("test") Cheetah cheetah) {
        return cheetah.hashCode();
    }

}
