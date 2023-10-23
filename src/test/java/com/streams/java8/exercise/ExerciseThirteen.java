package com.streams.java8.exercise;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

class ExerciseThirteen {

    @Test
    void joiningStringsImperativeWay() {
        List<String> names = List.of(
                "shubham",
                "ramesh",
                "wagh"
        );

        //way1
        String result1 = "";
        for (String name : names) {
            result1 += name + "|";
        }
        System.out.println(result1.substring(0, result1.length()-1));

        //way2
        String result2 = String.join("|", names);
        System.out.println(result2);
    }

    @Test
    void joiningStrings() {
        List<String> names = List.of(
                "shubham",
                "ramesh",
                "wagh"
        );

        String result1 = names.stream()
                .collect(Collectors.joining("|"));

        String result2 = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("|"));

        System.out.println(result1);
        System.out.println(result2);
    }
}
