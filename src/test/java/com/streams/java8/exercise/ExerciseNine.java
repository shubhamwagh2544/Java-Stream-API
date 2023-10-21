package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import com.streams.java8.beans.Car;
import com.streams.java8.beans.Person;
import com.streams.java8.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;

class ExerciseNine {

    @Test
    void count() throws IOException {
        //count of females
        List<Person> people = MockData.getPeople();

        long femaleCount = people.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("female"))
                .count();

        System.out.println(femaleCount);
    }

    @Test
    void min() throws IOException {
        //yellow car with the lowest price
        double minYellowCar = MockData.getCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(car -> car.getPrice())
                .min()
                .getAsDouble();

        System.out.println(minYellowCar);
    }

    @Test
    void max() throws IOException {
        //yellow car with the highest price
        double maxYellowCar = MockData.getCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPrice)
                .max()
                .orElse(-1);

        System.out.println(maxYellowCar);
    }

    @Test
    void sum() throws IOException {
        //sum of car prices
        double sumOfCarPrices = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .sum();

        BigDecimal bigDecimalSum = BigDecimal.valueOf(sumOfCarPrices);
        System.out.println(sumOfCarPrices);
        System.out.println(bigDecimalSum);
    }

    @Test
    void avg() throws IOException {
        //avg of car prices
        ImmutableList<Integer> list = ImmutableList.of();

        double avg1 = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .average()
                .orElse(-100.00);

        double avg2 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(-100.00);

        System.out.println(avg1);
        System.out.println(avg2);
    }

    @Test
    void statistics() throws IOException {
        //get all these function values as combined single object
        DoubleSummaryStatistics summaryStatistics = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .summaryStatistics();

        System.out.println(summaryStatistics);

        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getMax());
    }

}
