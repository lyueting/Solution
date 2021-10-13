package com.example.solution.entity;

import com.example.solution.skill.Swim;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fish extends Animal implements Swim {
    private static final Logger logger = LoggerFactory.getLogger(Fish.class);
    
    @Override
    public void swim() {
        logger.info("I am swimming");
    }
}
