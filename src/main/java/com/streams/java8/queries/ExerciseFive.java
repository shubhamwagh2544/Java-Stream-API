package com.streams.java8.queries;

import com.streams.java8.beans.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//car with price <= 5000 and color is PINK

@Repository
public interface ExerciseFive extends JpaRepository<Car, Integer> {
    List<Car> findAllByPriceLessThanEqualAndColor(Double price, String color);

    @Query(
            value = """
                    select *
                    from car
                    where price <= ?1
                    and color = ?2
                    """,
            nativeQuery = true
    )
    List<Car> selectCarWithPriceLessThanAndColorPinkNativeQuery(Double price, String color);

    @Query(
            value = """
                    select c
                    from Car c
                    where c.price <= :price
                    and color = :color
                    """
    )
    List<Car> selectCarWithPriceLessThanAndColorPink(@Param("price") Double price,
                                                     @Param("color") String color);
}
