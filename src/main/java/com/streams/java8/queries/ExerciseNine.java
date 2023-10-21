package com.streams.java8.queries;

import com.streams.java8.beans.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

//yellow car with the lowest price
//yellow car with the highest price
//sum of car prices
//avg of car prices

@Repository
public interface ExerciseNine extends JpaRepository<Car, Integer> {

    @Query(
            value = """
                    select min(price)
                    from car
                    where color = :color
                    """,
            nativeQuery = true
    )
    Car selectYellowCarWithLowestPrice(@Param("color") String color);

    @Query(
            value = """
                    select max(price)
                    from car
                    where color = :color
                    """,
            nativeQuery = true
    )
    Car selectYellowCarWithHighestPrice(@Param("color") String color);

    @Query(
            value = """
                    select sum(price)
                    from car
                    """,
            nativeQuery = true
    )
    BigDecimal selectSumOfCarPrices();

    @Query(
            value = """
                    select avg(price)
                    from car
                    """,
            nativeQuery = true
    )
    Double selectAverageOfCarPrices();
}
