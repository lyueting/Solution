package com.example.solution.entity;

import com.example.solution.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chicken extends Animal {
    private static final Logger logger = LoggerFactory.getLogger(Chicken.class);

    public void sing() {
        logger.info(Constant.CHICKEN_SING);
    }
}
