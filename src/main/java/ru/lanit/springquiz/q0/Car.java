package ru.lanit.springquiz.q0;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Scope(scopeName = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Car {
    private int id;

    {
        id = Application.seq.getAndAdd(1);
    }

    public void printId() {
        System.out.println(id);
    }
}
