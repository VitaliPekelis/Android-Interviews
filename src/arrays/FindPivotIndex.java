package arrays;

public class FindPivotIndex {
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
