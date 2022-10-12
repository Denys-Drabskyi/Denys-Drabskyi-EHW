package com.epam.spring.homework2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(OtherConfig.class)
@ComponentScan(basePackages = {"com.epam.spring.homework2.beans"})
public class BeansConfig {}
