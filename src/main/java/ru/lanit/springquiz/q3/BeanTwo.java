package ru.lanit.springquiz.q3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(value = "prototype")
public class BeanTwo {

    @PostConstruct
    private void init(){
        System.out.println("Hello from BeanTwo");
    }
}
