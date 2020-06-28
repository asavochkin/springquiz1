package ru.lanit.springquiz.q4;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class SecretBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Autowired
    SuperSecretScopeGenerator superSecretScopeGenerator;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        beanFactory.getBeanDefinition("secretBean")
                .setScope(superSecretScopeGenerator.getScopeForDefinitionName("secretBean"));
    }
}
