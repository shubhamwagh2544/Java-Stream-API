package com.streams.java8.exercise;

import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Predicate;

class ExerciseEight {
    @Test
    void findAny() throws IOException {
        Predicate<Person> personPredicate = person -> person.getAge() >= 20 && person.getAge() <= 50;

        Person person = MockData.getPeople().stream()
                .filter(personPredicate)
                .findAny()
                .get();

        System.out.println(person);
    }

    @Test
    void findFirst() throws IOException {
        Predicate<Person> personPredicate = person -> person.getAge() >= 20 && person.getAge() <= 50;

        Person person = MockData.getPeople().stream()
                .filter(personPredicate)
                .findFirst()
                .get();

        System.out.println(person);
    }

    @Test
    void findAny1() throws IOException {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Predicate<Integer> predicate = num -> num >= 5 && num <= 10;

        Integer ans = Arrays.stream(numbers)
                .filter(predicate)
                .findAny()
                .orElse(-1);

        System.out.println(ans);
    }

    @Test
    void findFirst1() throws IOException {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Predicate<Integer> predicate = num -> num >= 5 && num <= 10;

        Integer ans = Arrays.stream(numbers)
                .filter(predicate)
                .findFirst()
                .orElse(-1);

        System.out.println(ans);
    }
}
