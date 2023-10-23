package com.streams.java8.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ExerciseTwelve {

    private static final List<List<String>> listOfLists = List.of(
            List.of("AB", "BC"),
            List.of("CD", "DE"),
            List.of("EF", "FG"),
            List.of("GH", "HI"),
            List.of("IJ", "JK")
    );

    @BeforeEach
    public void setUp() {
        System.out.println(listOfLists);
    }

    //imperative way
    @Test
    void withoutFlatMap() {
        //imperative / traditional way
        List<String> flattenedList = new ArrayList<>();

        for (List<String> list : listOfLists) {
            for (String str : list) {
                flattenedList.add(str);
            }
        }

        flattenedList.forEach(System.out::println);
    }

    //Flattening Nested Collections
    @Test
    void flatMap1() {
        //flattening the nested collection into single one
        List<String> flattenedList = listOfLists.stream()
                //.flatMap(list -> list.stream())
                .flatMap(List::stream)
                .collect(Collectors.toList());

        flattenedList.forEach(System.out::println);
    }

    //Transforming and Flattening Elements
    @Test
    void flatMap2() {
        List<String> names = List.of("Shubham", "Ramesh", "Wagh");

        List<String> flattedList = names.stream()
                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.toList());

        flattedList.forEach(System.out::println);
    }

    @Test
    void ok() {
        String s = "abc";

        IntStream chars = s.chars();
        chars.forEach(System.out::println);         // 97 98 99

        Stream<String> obj = chars.mapToObj(code -> String.valueOf((char) code));       //97 -> String(char(97))
        List<String> list = obj.toList();

        list.forEach(System.out::println);
    }
}
