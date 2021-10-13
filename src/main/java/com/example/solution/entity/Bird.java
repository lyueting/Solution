package com.example.solution.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird extends Animal {
    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    public void fly() {
        logger.info("I am flying");
    }

    public void sing() {
        logger.info("I am singing");
    }
}

