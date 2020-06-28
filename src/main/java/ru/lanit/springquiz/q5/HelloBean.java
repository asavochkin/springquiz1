package ru.lanit.springquiz.q5;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void printHello(String from){
        System.out.println("Hello from " + from);
    }
}
