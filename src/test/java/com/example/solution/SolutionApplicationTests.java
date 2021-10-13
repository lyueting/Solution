package com.example.solution;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.example.solution.constant.Constant;
import com.example.solution.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.util.List;

class SolutionApplicationTests {

    @Test
    void BirdSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(SingingAnimal.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Bird bird = new Bird();
        bird.sing();

        Assertions.assertEquals(Constant.DEFAULT_SING, logsList.get(0)
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

    @Test
    void ParrotNearDogSingTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Dog.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Parrot parrot = new Parrot(new Dog());
        parrot.sing();

        Assertions.assertEquals(Constant.DOG_SING, logsList.get(0)
                .getMessage());
    }

    @Test
    void SharkSizeTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Shark.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Shark shark = new Shark();
        shark.size();

        Assertions.assertEquals(Constant.SHARK_SIZE, logsList.get(0)
                .getMessage());
    }

    @Test
    void ClownfishSizeTest() {
        Logger logger = (Logger) LoggerFactory.getLogger(Clownfish.class);
        ListAppender<ILoggingEvent> listAppender = new ListAppender<>();
        listAppender.start();
        logger.addAppender(listAppender);
        List<ILoggingEvent> logsList = listAppender.list;

        Clownfish clownfish = new Clownfish();
        clownfish.size();

        Assertions.assertEquals(Constant.CLOWNFISH_SIZE, logsList.get(0)
                .getMessage());
    }

    @Test
    void ButterflyTest() {
        Butterfly butterfly = new Butterfly();

        Assertions.assertTrue(butterfly.getCurrentState() instanceof Caterpillar);

        butterfly.transform();

        Assertions.assertTrue(butterfly.getCurrentState() instanceof Butterfly);
    }

}
