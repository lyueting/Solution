package com.example.solution.entity;

import com.example.solution.constant.Constant;
import com.example.solution.skill.Sing;
import com.example.solution.skill.Walk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rooster implements Walk, Sing {
    private static final Logger logger = LoggerFactory.getLogger(Rooster.class);

    @Override
    public void sing() {
        logger.info(Constant.ROOSTER_SING);
    }

    @Override
    public void walk() {
        logger.info("I am walking");
    }
}
