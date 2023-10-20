package com.streams.java8.exercise;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ExerciseThree {
    @Test
    void min() {
        final List<Integer> list = ImmutableList.of(1, 5, 2, 4, 7, 100, 43, 67, 87, 13);

        Integer min = list.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(min);
        assertThat(min).isEqualTo(1);
    }

    @Test
    void max() {
        final List<Integer> list = ImmutableList.of(1, 5, 2, 4, 7, 100, 43, 67, 87, 13);

        Integer max = list.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);
        assertThat(max).isEqualTo(100);
    }
}
