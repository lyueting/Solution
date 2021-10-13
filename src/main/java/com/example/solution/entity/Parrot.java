package com.example.solution.entity;

import com.example.solution.skill.Sing;

public class Parrot extends SingingAnimal implements Sing {
    SingingAnimal liveNearAnimal = new SingingAnimal();

    public Parrot(SingingAnimal animal) {
        liveNearAnimal = animal;
    }

    public void sing() {
        liveNearAnimal.sing();
    }
}
