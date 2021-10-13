package com.example.solution.entity;

import com.example.solution.skill.Fly;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Butterfly extends Insect implements Fly {
    private static final Logger logger = LoggerFactory.getLogger(Butterfly.class);

    private Insect currentState = new Caterpillar();

    public void transform() {
        currentState = new Butterfly();
    }

    public Insect getCurrentState() {
        return currentState;
    }

    @Override
    public void fly() {
        logger.info("I am flying");
    }
}
