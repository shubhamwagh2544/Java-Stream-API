package com.streams.java8.queries;

import com.streams.java8.beans.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseOne extends JpaRepository<Person, Integer> {

}
