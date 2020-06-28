package ru.lanit.springquiz.q8;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo implements Printer {
    public void print(String text){
        System.out.println("Bean two:" + text);
    }
}
