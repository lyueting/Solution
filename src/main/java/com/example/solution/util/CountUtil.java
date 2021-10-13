package com.example.solution.util;

import com.example.solution.entity.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountUtil {
    private static final Logger logger = LoggerFactory.getLogger(CountUtil.class);

    private CountUtil() {

    }

    public static <T> int countSkill(Animal[] animals, Class<T> type) {
        int count = 0;
        if (animals != null) {
            for (int i = 0; i < animals.length; i++) {
                if (type.isInstance(animals[i])) {
                    count++;
                }
            }
        }

        return count;
    }
}
