package ru.lanit.springquiz.q4;

import org.springframework.stereotype.Component;

@Component
public class SuperSecretScopeGenerator {
    public String getScopeForDefinitionName(String beanDefinitionName){
        return "prototype";
    }
}
