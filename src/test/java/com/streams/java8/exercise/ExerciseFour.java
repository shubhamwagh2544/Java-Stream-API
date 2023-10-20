package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseFour {
    @Test
    void distinct() {
        final List<Integer> list = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        List<Integer> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        assertThat(distinctList).hasSize(5);
        distinctList.forEach(System.out::println);
    }

    @Test
    void distinctWithSet() {
        final List<Integer> list = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        Set<Integer> distinctSet = list.stream()
                .distinct()
                .collect(Collectors.toSet());

        assertThat(distinctSet).hasSize(5);
        distinctSet.forEach(System.out::println);
    }
}
