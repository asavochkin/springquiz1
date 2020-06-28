package ru.lanit.springquiz.q0;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.atomic.AtomicInteger;

public class Application {

    public static AtomicInteger seq = new AtomicInteger(1);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("q0.xml");
        User b = (User) context.getBean("user");
        b.printCarId();
        b.printCarId();
        b.printCarId();
    }
}
