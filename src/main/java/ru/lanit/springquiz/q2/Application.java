package ru.lanit.springquiz.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.lanit.springquiz.q2");
        BeanOne beanOne = (BeanOne) context.getBean("beanOne");
        System.out.println(beanOne.echo("Hello"));
    }
}
