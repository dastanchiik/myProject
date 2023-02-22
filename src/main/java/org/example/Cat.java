package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{

    public Cat() {
        System.out.println("beam is created!!!");
    }

    @Override
    public void voice() {
        System.out.println("I am a Cat");
    }
}
