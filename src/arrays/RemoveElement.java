package arrays;

public class RemoveElement {

    /*
        27. Remove Element
    *                       https://leetcode.com/problems/remove-element/
    * */
    public static int removeElement(int[] nums, int val) {

        int indexOfNonVal = 0;
        for (int elem: nums) {
            if(elem != val) {
                nums[indexOfNonVal++] = elem;
            }
        }

        return indexOfNonVal;
    }




    public static void main (String[] arg) {
        int[] nums = new int[] {1,5,3,6,1,1};
        int val = 1;

        long startTime = System.nanoTime();
        System.out.println("removeElement val = "+val+" result " + removeElement(nums, val));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }

}
