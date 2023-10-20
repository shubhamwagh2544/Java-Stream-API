package com.streams.java8;

import com.streams.java8.mockdata.MockData;
import com.streams.java8.queries.ExerciseOne;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Java8StreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8StreamsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ExerciseOne exerciseOne) {
		return args -> {
			//save all first
			exerciseOne.saveAll(MockData.getPeople());


			//exerciseOne.selectAllPersonWhoseAgeIsLessThan(18)
			//		.forEach(System.out::println);

			//exerciseOne.findAllByAgeLessThanEqual(18)
			//		.forEach(System.out::println);

			//exerciseOne.selectAllPersonWhoseAgeIsLessThanLimit(18)
			//		.forEach(System.out::println);

			//exerciseOne.findFirst10ByAgeLessThanEqual(18)
			//		.forEach(System.out::println);


		};
	}

}
