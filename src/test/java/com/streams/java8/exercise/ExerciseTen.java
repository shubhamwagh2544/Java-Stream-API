package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import com.streams.java8.beans.Car;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class ExerciseTen {
    @Test
    void groupCarByMaker() throws IOException {
        ImmutableList<Car> cars = MockData.getCars();

        Map<String, List<Car>> groupedListByMaker = cars.stream()
                .collect(Collectors.groupingBy(car -> car.getMake()));

        groupedListByMaker.forEach((maker, carList) -> {
            System.out.println(maker);
            carList.forEach(System.out::println);
        });
    }

    @Test
    void groupingAndCounting() {
        List<String> names = List.of(
                "john",
                "john",
                "salman",
                "salman",
                "salman",
                "salman",
                "ravi",
                "jaya"
        );

        Map<String, Long> groupingByCount = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        groupingByCount.forEach((name, count) -> {
            System.out.println("name: " + name + " || count : " + count);
        });
    }
}
