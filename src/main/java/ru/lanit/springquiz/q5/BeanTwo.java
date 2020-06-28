package ru.lanit.springquiz.q5;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanTwo {
    @Autowired
    private HelloBean hello;

    public void printHello(){
        hello.printHello("BeanTwo");
    }
}
