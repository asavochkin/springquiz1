package ru.lanit.springquiz.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.lanit.springquiz.q3");
        System.out.println("Context started");
        context.getBean(BeanTwo.class);
        context.getBean(BeanOne.class);
    }

}
