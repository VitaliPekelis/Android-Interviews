package arrays;

public class CheckStraightLine {

    /*
    1232. Check If It Is a Straight Line
    https://leetcode.com/problems/check-if-it-is-a-straight-line/

    You have given an array of coordinates, write a program to find out if an array of coordinates make a straight line in the 2D plane.
    Each coordinate is an array of two values x and y, where x represents a coordinate point on X-axis and y represents the coordinate point on Y-axis of 2D plane.
    * */

    public static boolean checkIfItStraightLine(int[][] coordinates) {

        int changeX = coordinates[1][0] - coordinates[0][0];
        int changeY = coordinates[1][1] - coordinates[0][1];

        for(int i = 2; i <  coordinates.length; i++) {
            int diffX = coordinates[i][0] - coordinates[i - 1][0];
            int diffY = coordinates[i][1] - coordinates[i - 1][1];

            if(changeY * diffX != changeX * diffY) {
                return false;
            }
        }
        return true;
    }


    public static void main (String[] arg) {

//        int[][] coordinates = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] coordinates = new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        long startTime = System.nanoTime();
        System.out.println("check If It Straight Line = " + checkIfItStraightLine(coordinates));
        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " +(endTime - startTime)/1000000);
    }
}
