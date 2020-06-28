package ru.lanit.springquiz.q8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.lanit.springquiz.q8");
        context.getBean(BeanOne.class).print("Hello");
    }

}