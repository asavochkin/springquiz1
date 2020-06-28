package ru.lanit.springquiz.q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo {

    @Autowired
    private BeanOne beanOne;

}
