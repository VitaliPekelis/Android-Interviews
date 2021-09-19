package arrays;

import java.util.Arrays;

public class MergeSortedArray {

    /**
     *  88. Merge Sorted Array  (little changed)
     *  https://leetcode.com/problems/merge-sorted-array/
     * */

    public static int[] mergeSortedArray(int[] numbers1, int[] numbers2) {
        if(numbers1 == null && numbers2 == null) {
            return new int[0];
        } else if (numbers1 == null) {
            return numbers2;
        } else if (numbers2 == null) {
            return numbers1;
        }

        int index1 = 0, index2 = 0, resultIndex = 0;
        int[] result = new int[numbers1.length + numbers2.length];


        while(index1 <= numbers1.length - 1 && index2 <= numbers2.length - 1) {
            if(numbers1[index1] <= numbers2[index2]) {
                result[resultIndex] = numbers1[index1++];
            } else if(numbers2[index2] < numbers1[index1]) {
                result[resultIndex] = numbers2[index2++];
            }
            resultIndex++;
        }

        while (index1 <= numbers1.length - 1) {
            result[resultIndex++] = numbers1[index1++];
        }

        while (index2 <= numbers2.length - 1) {
            result[resultIndex++] = numbers2[index2++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 19};
        int[] arr2 = {2, 3, 3, 6, 10};

        long startTime = System.nanoTime();
        System.out.println("increment one result " + Arrays.toString(mergeSortedArray(arr1, arr2)));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }

}
