package ru.lanit.springquiz.q3;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

    @Autowired
    BeanTwo beanTwo;

    public void afterPropertiesSet(){
        System.out.println("Hello from BeanOne");
    }
}
