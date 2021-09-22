package arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {

    /*
    * https://leetcode.com/problems/squares-of-a-sorted-array/
    *
    *  977. Squares of a Sorted Array
    * */
    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int i = right;
        while (i >= 0) {
            int num;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                num = nums[right];
                right--;
            } else {
                num = nums[left];
                left++;
            }

            ans[i] = num * num;
            i--;
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr1 = {-45, -5, 9, 19};

        long startTime = System.nanoTime();
        System.out.println("result " + Arrays.toString(sortedSquares(arr1)));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
