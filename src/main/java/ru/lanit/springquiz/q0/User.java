package ru.lanit.springquiz.q0;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Car car;

    public User(Car car) {
        this.car = car;
    }

    public void printCarId() {
        car.printId();
    }
}
