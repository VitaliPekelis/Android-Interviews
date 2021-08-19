package arrays;

public class LargestNumberAtLeastTwiceOfOthers {
    // 747. Largest Number At Least Twice of Others

    /*
    https://leetcode.com/problems/largest-number-at-least-twice-of-others/

    You are given an integer array nums where the largest integer is unique.
    Determine whether the largest element in the array is at least twice as much as every other number in the array.
    If it is, return the index of the largest element, or return -1 otherwise.
    */

    public static int findLargestNumberAtLeastTwiceOfOthers(int[] nums) {
        int maxVal = 0, maxIndex = 0;

        //Scan through the array to find the unique largest element and store the index
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }

        // Scan through the array again. If we find some `value != maxVal` && `maxVal < 2*value`, we should return `-1`.
        for (int num : nums) {
            if (maxVal != num && num * 2 > maxVal) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        //int[] num = new int[] {1};
        //int[] num = new int[] {1,2,3,4};
        int[] num = new int[] {3,6,1,0};
        long startTime = System.currentTimeMillis();
        System.out.println("position = " + findLargestNumberAtLeastTwiceOfOthers(num));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
