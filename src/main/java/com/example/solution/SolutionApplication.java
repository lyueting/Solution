package com.example.solution;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class Animal {

    void walk(){
        System.out.println("I am walking");
    }

}

class Bird extends Animal {

    void fly() {
        System.out.println("I am flying");
    }

}


@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }

}
