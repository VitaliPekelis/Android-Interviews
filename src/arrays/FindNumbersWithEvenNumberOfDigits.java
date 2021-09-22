package arrays;

public class FindNumbersWithEvenNumberOfDigits {

    /*
    *  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    *
    *  1295. Find Numbers with Even Number of Digits
    * */

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 566, 97, 1977, 12, 566, 97, 1977};

        long startTime = System.nanoTime();
        System.out.println("result = " + findNumbers(arr));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
