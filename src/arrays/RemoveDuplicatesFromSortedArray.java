package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    /*
    26. Remove Duplicates from Sorted Array
    * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    * */

    public static int removeDuplicates(int[] nums) {
        /*Solution 1*/
//         if(nums == null || nums.length == 0) return 0;

//         int readIndex = 0, writeIndex = 0, value = Integer.MIN_VALUE;
//         while(readIndex < nums.length){
//             if(nums[readIndex] > value) {
//                 nums[writeIndex] = nums[readIndex];
//                 value = nums[writeIndex++];
//             }

//             readIndex++;
//         }

//         return writeIndex;

        /*Solution 1*/
        if (nums.length == 0) return 0;
        int index = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        result = index+1;

        /*Temporary while loop*/
        while(index < nums.length){
            nums[index++] = 0;
        }

        return result;
    }

    public static void main (String[] arg) {
        int[] nums = new int[] {-5,-5,-1,0,0,1,3,3,9,9};

        long startTime = System.nanoTime();
        System.out.println("removeDuplicates result " + removeDuplicates(nums) +" "+Arrays.toString(nums));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
