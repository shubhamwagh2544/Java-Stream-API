package com.streams.java8.queries;

import com.streams.java8.beans.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//avg of car prices

@Repository
public interface ExerciseSeven extends JpaRepository<Car, Integer> {
    @Query(
            value = """
                    select avg(price)
                    from car
                    """,
            nativeQuery = true
    )
    Double selectAverageOfCarPricesNativeQuery();

    @Query(
            value = """
                    select avg(c.price)
                    from Car c
                    """
    )
    Double selectAverageOfCarPrices();
}
