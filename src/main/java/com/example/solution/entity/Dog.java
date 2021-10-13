package com.example.solution.entity;

import com.example.solution.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dog extends WalkingAnimal {
    private static final Logger logger = LoggerFactory.getLogger(Dog.class);

    public void sing() {
        logger.info(Constant.DOG_SING);
    }
}
