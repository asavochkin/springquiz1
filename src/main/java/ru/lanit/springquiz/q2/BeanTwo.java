package ru.lanit.springquiz.q2;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanTwo {

    @Autowired
    private BeanThree beanThree;

    public String echo(String text){
        return beanThree.echo(text);
    }
}
