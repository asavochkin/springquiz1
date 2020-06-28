package ru.lanit.springquiz.q7;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanOne {
    @Autowired
    private BeanTwo beanTwo;

    public void print(String text){
        beanTwo.print(text);
    }

    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
}
