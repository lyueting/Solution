package com.example.solution;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.example.solution.constant.Constant;
import com.example.solution.entity.*;
import com.example.solution.skill.Fly;
import com.example.solution.skill.Sing;
import com.example.solution.skill.Swim;
import com.example.solution.skill.Walk;
import com.example.solution.util.CountUtil;
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

    @Test
    void CountSkillTest() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(new Dog()),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };

        Assertions.assertEquals(3, CountUtil.countSkill(animals, Fly.class));
        Assertions.assertEquals(6, CountUtil.countSkill(animals, Walk.class));
        Assertions.assertEquals(7, CountUtil.countSkill(animals, Sing.class));
        Assertions.assertEquals(5, CountUtil.countSkill(animals, Swim.class));
    }

}
