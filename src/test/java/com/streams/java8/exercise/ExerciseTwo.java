package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class ExerciseTwo {
    @Test
    void range() {
        //imperative way
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        //IntStream : functional way
        IntStream.range(0, 10).forEach(System.out::println);            //range(inclusive, exclusive)

        IntStream.rangeClosed(0, 10).forEach(System.out::println);      //rangeClosed(inclusive, inclusive)
    }

    @Test
    void rangeIteratingList() throws IOException {
        List<Person> people = MockData.getPeople();

        IntStream.range(0, people.size())
                .forEach(index -> {
                    Person person = people.get(index);
                    System.out.println(person.getFirstName());
                });
    }

    @Test
    void intStreamIterating() {
        //iterate(base, base=base+x)
        IntStream.iterate(0, operand -> operand+1)
                .limit(20)                                  //will keep continuing if no limit
                .forEach(System.out::println);

        //even numbers
        IntStream.iterate(1, operand -> operand+1)
                .limit(100)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
