package com.part1.TwoSum;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void checkSumOfElementOfTwoArray(){
        int[] array = {3,2,3};
        int target = 6;
        int[] actual = TwoSum.twoSum(array, target);
        int[] expected = {0, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}