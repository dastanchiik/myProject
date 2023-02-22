package org.example;

import org.springframework.stereotype.Component;

@Component("myDog")
public class Dog implements Pet{

    @Override
    public void voice() {
        System.out.println("I am a Dog");
    }
}
