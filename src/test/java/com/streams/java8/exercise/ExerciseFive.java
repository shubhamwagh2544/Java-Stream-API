package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import com.streams.java8.beans.Car;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseFive {
    @Test
    void filter() throws IOException {
        ImmutableList<Car> cars = MockData.getCars();

        Predicate<Car> carPredicate = car ->
                car.getPrice() <= 50000 &&
                car.getColor().equals("Pink");

        List<Car> carList1 = cars.stream()
                .filter(carPredicate)
                .collect(Collectors.toList());

        List<Car> carList2 = cars.stream()
                .filter(car -> car.getColor().equals("Pink") && car.getPrice() <= 50000)
                .collect(Collectors.toList());

        assertThat(carList1.size()).isEqualTo(carList2.size());
        System.out.println(carList1.size());
        System.out.println(carList2.size());
    }
}
