package com.fillswim.spring.Introduction;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callPet() {
        pet.say();
    }
}
