package com.streams.java8;

import com.streams.java8.beans.Car;
import com.streams.java8.beans.CarMakeDTO;
import com.streams.java8.mockdata.MockData;
import com.streams.java8.queries.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Java8StreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8StreamsApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ExerciseOne exerciseOne,
										ExerciseThree exerciseThree,
										ExerciseFour exerciseFour,
										ExerciseFive exerciseFive,
										ExerciseSeven exerciseSeven,
										ExerciseNine exerciseNine,
										ExerciseTen exerciseTen) {
		return args -> {
			//save all first
			//exerciseOne.saveAll(MockData.getPeople());
			//exerciseThree.saveAll(MockData.getPeople());
			//exerciseFour.saveAll(MockData.getPeople());
			//exerciseFive.saveAll(MockData.getCars());
			//exerciseSeven.saveAll(MockData.getCars());
			//exerciseNine.saveAll(MockData.getCars());
			exerciseTen.saveAll(MockData.getCars());


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

			/*
			List<Car> pinkCars = exerciseFive.findAllByPriceLessThanEqualAndColor(50000.00, "Pink");
			System.out.println(pinkCars.size());

			List<Car> pinkCars1 = exerciseFive.selectCarWithPriceLessThanAndColorPinkNativeQuery(50000.00, "Pink");
			System.out.println(pinkCars1.size());

			List<Car> pinkCars2 = exerciseFive.selectCarWithPriceLessThanAndColorPink(50000.00, "Pink");
			System.out.println(pinkCars2.size());
			 */

			/*
			Double avg1 = exerciseSeven.selectAverageOfCarPrices();
			Double avg2 = exerciseSeven.selectAverageOfCarPricesNativeQuery();

			System.out.println(avg1);
			System.out.println(avg2);
			 */

			/*
			Double countOfFemales1 = exerciseFour.selectCountOfFemales1("female");
			Double countOfFemales2 = exerciseFour.selectCountOfFemales2("female");
			Double countOfFemales3 = exerciseFour.selectCountOfFemales3("female");
			System.out.println(countOfFemales1);
			System.out.println(countOfFemales2);
			System.out.println(countOfFemales3);

			Double avgCarPrice = exerciseNine.selectAverageOfCarPrices();
			System.out.println(avgCarPrice);

			BigDecimal bigDecimalSumCarPrices = exerciseNine.selectSumOfCarPrices();
			System.out.println(bigDecimalSumCarPrices);

			Double yellowCarWithHighestPrice = exerciseNine.selectYellowCarWithHighestPrice("yellow");
			System.out.println(yellowCarWithHighestPrice);

			Double yellowCarWithLowestPrice = exerciseNine.selectYellowCarWithLowestPrice("yellow");
			System.out.println(yellowCarWithLowestPrice);
			 */

			/*
			exerciseTen.selectCarsByMaker();
			 */


		};
	}

}
