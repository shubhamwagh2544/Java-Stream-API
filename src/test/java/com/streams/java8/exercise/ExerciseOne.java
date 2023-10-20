package com.streams.java8.exercise;

import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people

class ExerciseOne {
    @Test
    void imperativeApproach() throws IOException {
        List<Person> personList = MockData.getPeople();
        List<Person> youngerPersonList = new ArrayList<>();
        int limit = 10;

        for (Person person : personList) {
            if (person.getAge() <= 18) {
                youngerPersonList.add(person);
                limit--;
            }
            if (limit == 0) break;

        }

        //print
        System.out.println(youngerPersonList.size());
        for (Person person : youngerPersonList) {
            System.out.println(person);
        }
    }

    @Test
    void declarativeApproachUsingStreams() throws Exception {
        MockData.getPeople().stream()
                .filter(person -> person.getAge() <= 18)
                .limit(10)
                .forEach(System.out::println);
    }

}
