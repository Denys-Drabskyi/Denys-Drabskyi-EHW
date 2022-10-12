package com.epam.spring.homework2.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    Animal[] animals;

    @Autowired
    public Pet(Animal[] animals) {
        this.animals = animals;

    }

    public void printPets (){
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}
