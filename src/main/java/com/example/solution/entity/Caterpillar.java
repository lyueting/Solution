package com.example.solution.entity;

import com.example.solution.skill.Walk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Caterpillar extends Insect implements Walk {
    private static final Logger logger = LoggerFactory.getLogger(Caterpillar.class);

    @Override
    public void walk() {
        logger.info("i am walking");
    }
}
