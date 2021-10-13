package com.example.solution.entity;

import com.example.solution.constant.Constant;
import com.example.solution.skill.Sing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SingingAnimal extends Animal implements Sing {
    private static final Logger logger = LoggerFactory.getLogger(SingingAnimal.class);

    @Override
    public void sing() {
        logger.info(Constant.ANIMAL_SING);
    }
}
