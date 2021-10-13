package com.example.solution.entity;

import com.example.solution.constant.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Clownfish extends Fish {
    private static final Logger logger = LoggerFactory.getLogger(Clownfish.class);

    public void size() {
        logger.info(Constant.CLOWNFISH_SIZE);
    }

    public void colour() {
        logger.info("colourful");
    }

    public void character() {
        logger.info("make jokes");
    }
}
