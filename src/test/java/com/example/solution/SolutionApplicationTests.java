package com.example.solution;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.example.solution.constant.Constant;
import com.example.solution.entity.Bird;
import com.example.solution.entity.Chicken;
import com.example.solution.entity.Duck;
import com.example.solution.entity.Rooster;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.List;

class SolutionApplicationTests {

    @Test
    void BirdSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Bird.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Bird bird = new Bird();
        bird.sing();

        Assertions.assertEquals(Constant.BIRD_SING, logsList.get(0)
                .getMessage());
    }

    @Test
    void ChickenSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Chicken.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Chicken chicken = new Chicken();
        chicken.sing();

        Assertions.assertEquals(Constant.CHICKEN_SING, logsList.get(0)
                .getMessage());
    }

    @Test
    void DuckSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Duck.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Duck duck = new Duck();
        duck.sing();

        Assertions.assertEquals(Constant.DUCK_SING, logsList.get(0)
                .getMessage());
    }

    @Test
    void RoosterSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Rooster.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Rooster rooster = new Rooster();
        rooster.sing();

        Assertions.assertEquals(Constant.ROOSTER_SING, logsList.get(0)
                .getMessage());
    }

}
