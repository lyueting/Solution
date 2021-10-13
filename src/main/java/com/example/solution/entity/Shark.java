package com.example.solution.entity;

import com.example.solution.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Shark extends Fish {
    private static final Logger logger = LoggerFactory.getLogger(Shark.class);

    public void size() {
        logger.info(Constant.SHARK_SIZE);
    }

    public void colour() {
        logger.info("grey");
    }

    public void character() {
        logger.info("eat other fish");
    }
}
