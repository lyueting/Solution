package com.example.solution;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import com.example.solution.entity.Bird;
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

        Assertions.assertEquals("I am singing", logsList.get(0)
                .getMessage());
    }

}
