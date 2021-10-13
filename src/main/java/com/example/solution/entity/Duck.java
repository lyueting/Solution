package com.example.solution.entity;

import com.example.solution.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck extends Bird {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    public void sing() {
        logger.info(Constant.DUCK_SING);
    }

    public void swim() {
        logger.info("I am swimming");
    }
}
