package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import com.streams.java8.beans.Person;
import com.streams.java8.beans.PersonDTO;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseSix {
    @Test
    void map() throws IOException {
        //transform one data type into another
        List<Person> people = MockData.getPeople();

        List<PersonDTO> peopleDtos = people.stream()
                .map(person -> new PersonDTO(person.getId(), person.getFirstName(), person.getAge()))
                .collect(Collectors.toList());

        assertThat(people.size()).isEqualTo(peopleDtos.size());

        System.out.println(people.size());
        System.out.println(peopleDtos.size());
    }

    @Test
    void filterAnother() throws IOException {
        List<Person> people = MockData.getPeople();

        long count = people.stream()
                .map(PersonDTO::map)
                .count();

        assertThat(count).isEqualTo(people.size());
        System.out.println(count);
        System.out.println(people.size());
    }
}
