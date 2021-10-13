package com.example.solution.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Animal {
    private static final Logger logger = LoggerFactory.getLogger(Animal.class);

    public void walk() {
        logger.info("I am walking");
    }
}
