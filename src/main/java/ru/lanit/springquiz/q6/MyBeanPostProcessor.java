package ru.lanit.springquiz.q6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    BeanCounter beanCounter;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        beanCounter.count();
        return bean;
    }
}
