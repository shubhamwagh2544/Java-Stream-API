package com.streams.java8.queries;

import com.streams.java8.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//find min age
//find max age

@Repository
public interface ExerciseThree extends JpaRepository<Person, Integer> {

    @Query(
            value = """
                    select min(age)
                    from person
                    """,
            nativeQuery = true
    )
    Integer selectMinAgeFromPersonNativeQuery();

    @Query(
            value = """
                    select min(p.age)
                    from Person p
                    """
    )
    Integer selectMinAgeFromPerson();

}
