package arrays;

public class FindPivotIndex {
/*
    Given an array of integers nums, calculate the pivot index of this array.

    The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

    If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

    Return the leftmost pivot index. If no such index exists, return -1.
*/

    public static int findPivotIndex(int[] num) {
        int allSum = 0, leftSum = 0;
        for (int item: num) {
            allSum += item;
        }
        for (int i = 0; i < num.length; i++) {
            if(leftSum == allSum - leftSum - num[i]) return i;
            leftSum += num[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = new int[] {5, 9, 4, 6, 5, 3};
        long startTime = System.currentTimeMillis();
        System.out.println("findPivotIndex " + findPivotIndex(num));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
