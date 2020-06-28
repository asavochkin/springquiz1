package ru.lanit.springquiz.q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.lanit.springquiz.q5");
        context.getBean(BeanOne.class).printHello();
        context.getBean(BeanTwo.class).printHello();
    }
}
