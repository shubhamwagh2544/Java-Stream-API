package com.streams.java8.exercise;

import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ExerciseFourteen {

    //how Collectors.toList() works
    @Test
    void collectorsToList() throws IOException {
        //way 1
        List<String> emails1 = MockData.getPeople().stream()
                .map(Person::getEmail)
                .limit(10)
                .collect(Collectors.toList());

        emails1.forEach(System.out::println);

        //way 2
        List<String> emails2 = MockData.getPeople().stream()
                .map(Person::getEmail)
                .limit(10)
                .collect(
                        () -> new ArrayList<String>(),
                        (list, email) -> list.add(email),
                        (list1, list2) -> list1.addAll(list2)
                );

        emails2.forEach(System.out::println);

        //way 3
        List<String> emails3 = MockData.getPeople().stream()
                .map(Person::getEmail)
                .limit(10)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );

        emails3.forEach(System.out::println);
    }
}
