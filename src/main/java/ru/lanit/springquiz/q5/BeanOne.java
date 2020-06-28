package ru.lanit.springquiz.q5;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {
    @Autowired
    private HelloBean helloBean;

    public void printHello(){
        helloBean.printHello("BeanOne");
    }
}
