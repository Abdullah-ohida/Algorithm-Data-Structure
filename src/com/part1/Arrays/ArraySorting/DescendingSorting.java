package com.part1.Arrays.ArraySorting;

import java.util.Arrays;

public class DescendingSorting {
    public static int[] sortArrDesc(int[] arr) {
        for(int count = 0; count < arr.length; count++){
            for(int counter = 1; counter < arr.length; counter++){
                if(arr[counter - 1] < arr[counter]){
                    int temp = arr[counter];
                    arr[counter] = arr[counter - 1];
                    arr[counter - 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortArrAscn(int[] arr) {
        for(int count = 0; count < arr.length; count++){
            for(int counter = 1; counter < arr.length; counter++){
                if(arr[counter - 1] > arr[counter]){
                    int temp = arr[counter];
                    arr[counter] = arr[counter - 1];
                    arr[counter - 1] = temp;
                }
            }
        }
        return arr;
    }


    public static int[] reverseArr(int[] arr) {
        int halfLength = arr.length / 2;
        int maxIndex = arr.length - 1;
     for(int count = 0; count < halfLength; count++){
        int temp = arr[count];
        arr[count] = arr[maxIndex - count];
        arr[maxIndex - count] = temp;
     }
          return arr;
    }
}
