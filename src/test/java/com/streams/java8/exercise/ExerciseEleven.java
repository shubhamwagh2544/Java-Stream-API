package com.streams.java8.exercise;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ExerciseEleven {
    @Test
    void reduce() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Integer reducedSum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);

        System.out.println(reducedSum);
    }

    @Test
    void reduceAgain() {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Integer reducedSum = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println(reducedSum);
    }
}
