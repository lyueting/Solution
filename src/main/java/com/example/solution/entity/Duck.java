package com.example.solution.entity;

import com.example.solution.constant.Constant;
import com.example.solution.skill.Swim;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck extends Bird implements Swim {
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    public void sing() {
        logger.info(Constant.DUCK_SING);
    }

    @Override
    public void swim() {
        logger.info("I am swimming");
    }
}
