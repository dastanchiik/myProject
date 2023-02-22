package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value( "${person.age}" )
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
    }

    public void call(){
        pet.voice();
    }

}
