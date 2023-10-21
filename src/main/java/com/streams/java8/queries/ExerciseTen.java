package com.streams.java8.queries;

import com.streams.java8.beans.Car;
import com.streams.java8.beans.CarMakeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//group car by maker

public interface ExerciseTen extends JpaRepository<Car, Integer> {
    @Query(
            value = """
                    select make, count(make)
                    from car
                    group by make
                    """,
            nativeQuery = true
    )
    List<CarMakeDTO> selectCarsByMaker();
}
