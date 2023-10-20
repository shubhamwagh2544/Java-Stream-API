package com.streams.java8.queries;

import com.streams.java8.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

// 1. Find people aged less or equal 18
// 2. Then change implementation to find first 10 people

@Repository
public interface ExerciseOne extends JpaRepository<Person, Integer> {

    @Query(
            value = """
                    select *
                    from person
                    where age <= ?1
                    """,
            nativeQuery = true
    )
    List<Person> selectAllPersonWhoseAgeIsLessThan(int age);

    @Query(
            value = """
                    
                    """
    )
    List<Person> findAllByAgeLessThanEqual(int age);
}
