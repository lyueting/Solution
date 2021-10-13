package com.example.solution.entity;

import com.example.solution.constant.Constant;
import com.example.solution.skill.Fly;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bird extends Animal implements Fly {
    private static final Logger logger = LoggerFactory.getLogger(Bird.class);

    public void fly() {
        logger.info("I am flying");
    }

    public void sing() {
        logger.info(Constant.BIRD_SING);
    }
}

