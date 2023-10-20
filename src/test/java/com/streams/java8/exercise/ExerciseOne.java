package com.streams.java8.exercise;

import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people
class ExerciseOne {
    @Test
    void imperativeApproach() throws IOException {
        List<Person> personList = MockData.getPeople();

    }

    @Test
    void declarativeApproachUsingStreams() throws Exception {

    }
}
