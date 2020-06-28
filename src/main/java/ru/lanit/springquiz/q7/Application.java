package ru.lanit.springquiz.q7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("q7.xml");
        try {
            context.getBean(BeanOne.class).print("Hello from bean one");
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            context.getBean(BeanThree.class).print("Hello from bean three");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
