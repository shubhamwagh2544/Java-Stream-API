package com.streams.java8.exercise;

import com.streams.java8.beans.Car;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseSeven {
    @Test
    void averageCarPrice() throws IOException {
        double avg1 = MockData.getCars().stream()
                .mapToDouble(car -> car.getPrice())
                .average()
                .orElse(0);

        double avg2 = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .average()
                .getAsDouble();

        assertThat(avg1).isEqualTo(avg2);

        System.out.println(avg1);
        System.out.println(avg2);
    }
}
