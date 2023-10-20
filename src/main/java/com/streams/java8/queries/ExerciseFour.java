package com.streams.java8.queries;

import com.streams.java8.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

//distinct age

@Repository
public interface ExerciseFour extends JpaRepository<Person, Integer> {

    @Query(
            value = """
                    select distinct age
                    from person
                    """,
            nativeQuery = true
    )
    List<Integer> selectDistinctAgeFromPersonNativeQuery();

    @Query(
            value = """
                    select distinct p.age
                    from Person p
                    """
    )
    List<Integer> selectDistinctAgeFromPerson();
}
