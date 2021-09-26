package arrays;


import java.util.Arrays;

public class MoveZeroesToLeft {


    /*
        283. Move Zeroes     https://leetcode.com/problems/move-zeroes/

     * Given an integer array, move all elements containing '0' to the left while maintaining the order of
     * other elements in the array.
     * */


    /*
     * Runtime Complexity = Linear, O(n).
     * Memory Complexity = Constant, O(1).
     *
     * Step 1: Keep two markers (readIndex and writeIndex) and point them to the end of the array
     * Step 2: If readIndex < 0, skip
     * Step 3: Iterate through the array in reverse, & if current element points to non zero,
     *         update the array current element to readindex element & increment writeIndex
     * */

    public static int[] moveZeroesToLeft(int[] arr) {

        int readIndex = arr.length-1;
        int writeIndex = arr.length-1;

        while (readIndex >= 0) {
            if(arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex--;
            }
            readIndex--;
        }

        while (writeIndex >=0) {
            arr[writeIndex] = 0;
            writeIndex--;
        }

        return arr;
    }



    /*
     * Given an integer array, move all elements containing '0' to the right while maintaining the order of
     * other elements in the array.
     * */
    public static int[] moveZeroesToRight2(int[] arr) {
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex <arr.length) {
            if(arr[readIndex] != 0) {
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
            readIndex++;
        }

        while (writeIndex < arr.length) {
            arr[writeIndex] = 0;
            writeIndex++;
        }
        return arr;
    }

    public static void moveZeroesToRight(int[] nums) {
        int writeIndex = 0, readIndex = 0;
        while (readIndex < nums.length) {
            if (nums[readIndex] == 0) {
                readIndex++;
                continue;
            }
            swap(nums, writeIndex, readIndex);
            writeIndex++;
            readIndex++;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 10, 20, 0, 0, 63, 0, 88, 0};

        long startTime = System.nanoTime();
        System.out.println("moveZeroesToLeft result " + Arrays.toString(moveZeroesToLeft(new int[]{1, 10, 20, 0, 0, 63, 0, 88, 0})));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);

        startTime = System.nanoTime();

        moveZeroesToRight(arr);
        System.out.println("moveZeroesToRight result " + Arrays.toString(arr));
        endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);

        startTime = System.nanoTime();
        arr = new int[]{1, 10, 20, 0, 0, 63, 0, 88, 0};
        moveZeroesToRight2(arr);
        System.out.println("moveZeroesToRight2 result " + Arrays.toString(arr));
        endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
