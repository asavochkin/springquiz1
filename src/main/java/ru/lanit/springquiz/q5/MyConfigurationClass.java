package ru.lanit.springquiz.q5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfigurationClass {

    @Bean
    Object beanOne(){
        return new BeanOne();
    }

    @Bean
    @Scope(scopeName = "prototype")
    Object beanTwo(){
        return new BeanTwo();
    }
}
