package ru.lanit.springquiz.q4;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SecretBean {
    @PostConstruct
    private void init(){
        System.out.println("Secret Bean started");
    }
}
