package search;

public class SearchInsertPositionArray {

    public static int linearSearchInsertPosition(int[] sums, int target) {
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] == target) return i;
            else if (sums[i] > target) return i;
        }
        return 0;
    }

    public static int binarySearchInsertPosition(int[] nums, int target) {
        int startIndex = 0, endIndex = nums.length - 1, mid;
        while (startIndex < endIndex) {
            mid = startIndex + (endIndex - startIndex) / 2;
            //we founded target in array
            if (nums[mid] == target) return mid;
                // the middle is smaller than target
            else if (nums[mid] < target) {
                startIndex = mid + 1;
            }
            //target is smaller than the middle and target is not existed in array
            else {
                endIndex = mid;
            }
        }

        if (startIndex == nums.length - 1 && nums[startIndex] < target) {
            return startIndex + 1;
        } else {
            return startIndex;
        }
    }

    public static void main(String[] arg) {
        int[] nums = new int[]{1, 2, 3, 4, 7, 10};
        long startTime = System.currentTimeMillis();
        System.out.println("linearSearchInsertPosition is " + linearSearchInsertPosition(nums, 7));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        startTime = System.currentTimeMillis();
        System.out.println("binarySearchInsertPosition is " + binarySearchInsertPosition(nums, 7));
        endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");
    }
}
