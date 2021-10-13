package com.example.solution.entity;

import com.example.solution.constant.Constant;
import com.example.solution.skill.Sing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cat extends WalkingAnimal implements Sing {
    private static final Logger logger = LoggerFactory.getLogger(Cat.class);

    public void sing() {
        logger.info(Constant.CAT_SING);
    }
}
