package ru.lanit.springquiz.q8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    @Autowired
    @Qualifier("beanTwo")
    private Printer beanThree;

    public void print(String text){
        beanThree.print(text);
    }
}
