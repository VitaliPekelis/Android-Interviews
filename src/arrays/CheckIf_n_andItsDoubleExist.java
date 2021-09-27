package arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIf_n_andItsDoubleExist {

    /*
    * 1346. Check If N and Its Double Exist
    *
    * https://leetcode.com/problems/check-if-n-and-its-double-exist/
    * */

    public static boolean checkIfExist(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int integer : arr) {
            if(set.contains(integer*2) || (integer%2 == 0 && set.contains(integer/2))) {
                return true;
            }
            set.add(integer);
        }

        return false;
    }




    public static void main(String[] args) {
        int[] arr1 = {7,1,14,11,9,3};

        long startTime = System.nanoTime();
        System.out.println("result " + checkIfExist(arr1));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
