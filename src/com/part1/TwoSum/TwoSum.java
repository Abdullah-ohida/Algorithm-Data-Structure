package com.part1.palindrome;

import java.util.Arrays;

public class NextSmallestPalindrome {
    public static int checkNextSmallest(int[] numberArr, int num) {
        return 0;
    }

    public static void main(String[] args) {
        int[] Arr = {3,2,3};
        System.out.println(Arrays.toString(twoSum(Arr, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexArr = new int[2];
        for(int count = 0; count < nums.length; count++){
            int counter = count + 1;
            while (counter < nums.length){
                if(nums[count] + nums[counter] == target){
                    indexArr[0] = count;
                    indexArr[1] = counter;
                    return indexArr;
                }
                counter++;
            }
        }
        return null;
    }
}
