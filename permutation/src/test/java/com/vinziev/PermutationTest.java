package com.vinziev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;

public class PermutationTest {

    @Test
    public void shouldReturnCorrectNumberOfPermutation() {
        List<Integer> in = List.of(1, 2, 3);
        int expectedSize = 6;
        List<List<Integer>> actual = new ArrayList<>();
        Permutation.permute(in, actual);
        assertEquals(expectedSize, actual.size());
    }

    @Test
    public void shouldContainAllPossiblePermutationInOrder() {
        List<List<Integer>> expected = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 2, 1),
                List.of(3, 1, 2));
        List<Integer> in = List.of(1, 2, 3);
        List<List<Integer>> actual = new ArrayList<>();
        Permutation.permute(in, actual);
        IntStream.range(0, expected.size()).forEach(i -> {
            assertTrue(expected.get(i).equals(actual.get(i)));
        });
    }
}
