package com.part1.Arrays.ArraySorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DescendingSortingTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIfArrayCanBeSortedInDescendingOrder(){
        int [] arr = {165, 73, 846, 64, 97};
        int [] sortedArr = DescendingSorting.sortArrDesc(arr);
        int [] expected = {846, 165, 97, 73, 64};
        assertEquals(Arrays.toString(expected), Arrays.toString(sortedArr));
    }

    @Test
    void testIfArrayCanBeSortedInAscendingOrder(){
        int [] arr = {165, 73, 846, 64, 97};
        int [] sortedArr = DescendingSorting.sortArrAscn(arr);
        int [] expected = {64, 73, 97, 165, 846};
        assertEquals(Arrays.toString(expected), Arrays.toString(sortedArr));
    }

    @Test
    void testIfArrayCanBeReverse(){
        int [] arr = {165, 73, 846, 64, 97};
        int [] sortedArr = DescendingSorting.reverseArr(arr);
        int [] expected = {97, 64, 846, 73, 165};

        assertEquals(Arrays.toString(expected), Arrays.toString(sortedArr));
    }
}