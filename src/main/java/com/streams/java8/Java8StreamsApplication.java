package com.streams.java8;

import com.streams.java8.beans.Car;
import com.streams.java8.mockdata.MockData;
import com.streams.java8.queries.ExerciseFive;
import com.streams.java8.queries.ExerciseFour;
import com.streams.java8.queries.ExerciseOne;
import com.streams.java8.queries.ExerciseThree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Java8StreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8StreamsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ExerciseOne exerciseOne,
										ExerciseThree exerciseThree,
										ExerciseFour exerciseFour,
										ExerciseFive exerciseFive) {
		return args -> {
			//save all first
			//exerciseOne.saveAll(MockData.getPeople());
			//exerciseThree.saveAll(MockData.getPeople());
			//exerciseFour.saveAll(MockData.getPeople());
			exerciseFive.saveAll(MockData.getCars());

			/*
			exerciseOne.selectAllPersonWhoseAgeIsLessThan(18)
					.forEach(System.out::println);

			exerciseOne.findAllByAgeLessThanEqual(18)
					.forEach(System.out::println);

			exerciseOne.selectAllPersonWhoseAgeIsLessThanLimit(18)
					.forEach(System.out::println);

			exerciseOne.findFirst10ByAgeLessThanEqual(18)
					.forEach(System.out::println);
			 */

			/*
			Integer min = exerciseThree.selectMinAgeFromPersonNativeQuery();
			System.out.println(min);

			Integer minimum = exerciseThree.selectMinAgeFromPerson();
			System.out.println(minimum);

			Integer max = exerciseThree.selectMaxAgeFromPersonNativeQuery();
			System.out.println(max);

			Integer maxAge = exerciseThree.selectMaxAgeFromPerson();
			System.out.println(maxAge);
			 */

			/*
			List<Integer> list = exerciseFour.selectDistinctAgeFromPerson();
			List<Integer> list1 = exerciseFour.selectDistinctAgeFromPersonNativeQuery();

			System.out.println(list1.size());
			System.out.println(list.size());
			 */


			List<Car> pinkCars = exerciseFive.findAllByPriceLessThanEqualAndColor(50000.00, "Pink");
			System.out.println(pinkCars.size());

			List<Car> pinkCars1 = exerciseFive.selectCarWithPriceLessThanAndColorPinkNativeQuery(50000.00, "Pink");
			System.out.println(pinkCars1.size());

			List<Car> pinkCars2 = exerciseFive.selectCarWithPriceLessThanAndColorPink(50000.00, "Pink");
			System.out.println(pinkCars2.size());
		};
	}

}
