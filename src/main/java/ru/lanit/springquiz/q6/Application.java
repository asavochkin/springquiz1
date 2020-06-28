package ru.lanit.springquiz.q6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("ru.lanit.springquiz.q6");
        System.out.println(context.getBean(BeanCounter.class).getBeanCount());
    }

}
