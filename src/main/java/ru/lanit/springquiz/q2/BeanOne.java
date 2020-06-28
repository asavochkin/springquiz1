package ru.lanit.springquiz.q2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

    private BeanTwo beanTwo;

    public BeanOne() {
        this.beanTwo = beanTwo();
    }

    public String echo(String text){
        return beanTwo.echo(text);
    }

    //other bean definitions
    @Bean
    private BeanTwo beanTwo(){
        return new BeanTwo();
    }

    @Bean
    private BeanThree beanThree(){
        return new BeanThree();
    }
}
