package ru.lanit.springquiz.q6;

import org.springframework.stereotype.Component;

@Component
public class BeanCounter {

    private int beanCount;

    public void count(){
        beanCount++;
    }

    public int getBeanCount() {
        return beanCount;
    }
}
