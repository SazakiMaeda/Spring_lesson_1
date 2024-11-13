package com.sazakimaeda.spring.newTest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.sazakimaeda.spring.newTest")
@PropertySource("classpath:compComponents.properties")
public class SpringConfig {
}
