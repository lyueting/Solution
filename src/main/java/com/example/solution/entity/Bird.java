package com.example.solution.entity;

import com.example.solution.skill.Fly;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird extends WalkingAnimal implements Fly {
    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    @Override
    public void fly() {
        logger.info("I am flying");
    }
}

