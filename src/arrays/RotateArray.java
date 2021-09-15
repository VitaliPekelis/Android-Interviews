package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    /**
     * 189. Rotate Array
     *
     * https://leetcode.com/problems/rotate-array/
     * */

    /*
     * First Solution
     * */
    public static void rotateSolution1(int[] nums, int steps) {
        steps = steps % nums.length;

        revers(nums, 0, nums.length - 1); //revers all
        revers(nums, 0, steps - 1); //revers firs
        revers(nums, steps, nums.length - 1); //revers second
    }

    public static void revers(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    /*
    * Second Solution
    * */
    public static List<Integer> rotateSolution2(List<Integer> arr, int rotation) {
        int length = arr.size();
        rotation = rotation % length;
        if(rotation < 0) {
            rotation = rotation + length;
        }

        /*
         * Step 1: copy all the values included in the rotation.
         * For eg: if rotation = 2, the copy last 2 values into temp array
         * */
        List<Integer> tempList = new ArrayList<>();
        for(int i=(length - rotation); i<length; i++) {
            tempList.add(arr.get(i));
        }


        /*
         * Step 2: shift all values not included in the rotation to the end of the array.
         * For eg: if rotation = 7, then shift length-rotation i.e 10-7 = 3 values to the end of the array
         * */
        for(int i=length-1; i>= rotation; i--) {
            arr.set(i, arr.get(i-rotation));
        }

        for(int i=0; i<rotation; i++) {
            arr.set(i, tempList.get(i));
        }

        return arr;
    }




    public static void main(String[] args) {
//        Integer[] arr1 = {1, 2, 3, 4, 5};
//        System.out.println(rotateSolution2(Arrays.asList(arr1), 3));

        int[] arr1 = {1, 2, 3, 4, 5};

        rotateSolution1(arr1, 3);

        long startTime = System.nanoTime();
        System.out.println("result " + Arrays.toString(arr1));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
