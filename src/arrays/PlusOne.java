package arrays;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] integer) {
        for (int i = integer.length - 1; i >= 0; i--) {
            if(integer[i] < 9) {
                integer[i]++;
                return integer;
            }
            integer[i] = 0;
        }

        int[] newInteger = new int[integer.length + 1];
        newInteger[0] = 1;
        return newInteger;
    }

    public static void main (String[] arg) {
//        int[] nums = new int[] {1,2,3};
//        int[] nums = new int[] {1,2,0,1};
//        int[] nums = new int[] {1,2,9};
        int[] nums = new int[] {9,9,9};

        long startTime = System.nanoTime();
        System.out.println("increment one result " + Arrays.toString(plusOne(nums)));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
