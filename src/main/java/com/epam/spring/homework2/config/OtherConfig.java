package com.epam.spring.homework2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PetConfig.class)
@ComponentScan(basePackages = {"com.epam.spring.homework2.other"})
public class OtherConfig {
}
