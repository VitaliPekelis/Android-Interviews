package matrices;

import java.util.Arrays;

public class DiagonalTraverse {

    /** https://leetcode.com/problems/diagonal-traverse/
     *
     *  498. Diagonal Traverse
     *
     *  Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
     * */

    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0];

        int rows = matrix.length, columns = matrix[0].length;
        int allNumbers = rows * columns, rowIndex = 0, columnIndex = 0;

        int[] result = new int[allNumbers];
        boolean isDirectionRight = true;

        for (int i = 0; i < allNumbers; i++) {
            //put the integer to result
            result[i] = matrix[rowIndex][columnIndex];

            /* Move diagonally */
            if (isDirectionRight) {
                columnIndex += 1;
                rowIndex -= 1;
            } else { // direction left
                columnIndex -= 1;
                rowIndex += 1;
            }

            /* Case of index out of matrix from the right */
            if (rowIndex >= rows) {
                rowIndex -= 1;
                columnIndex += 2;
                isDirectionRight = true;
            } else if (columnIndex >= columns) {
                columnIndex -= 1;
                rowIndex += 2;
                isDirectionRight = false;
            }
            /* Case of index out of matrix from the left */
            if (rowIndex < 0) {
                rowIndex = 0;
                isDirectionRight = false;
            } else if (columnIndex < 0) {
                columnIndex = 0;
                isDirectionRight = true;
            }
        }
        return result;
    }

    public static void printMatrixEachItem (int[][] matrix) {
        if(isNullOrEmpty(matrix)) return;

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            int [] row = matrix[rowIndex];
            for (int columnIndex = 0; columnIndex < row.length; columnIndex++) {
                System.out.println(row[columnIndex]);
            }
        }
    }

    public static void printMatrixEachRow (int[][] matrix) {
        if(isNullOrEmpty(matrix)) return;

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            int [] row = matrix[rowIndex];
            System.out.println(Arrays.toString(row));
        }
    }

    public static void printMatrix (int[][] matrix) {
        if(isNullOrEmpty(matrix)) return;
        System.out.println(Arrays.deepToString(matrix));
    }

    public static boolean isNullOrEmpty(int[][] matrix) {
        boolean result = matrix == null || matrix.length == 0;
        if(result) System.out.println(" ... matrix NULL or EMPTY ...");
        return result;
    }

    public static void main(String[] args) {

//        int[][] matrix = {
//                {1, 5, 45, 0, 81},
//                {6, 7, 2, 82, 8},
//                {20, 22, 49, 5, 5},
//                {0, 23, 50, 4, 92}
//        };

        int[][] matrix = {
                {0, 1, 5, 6, 13},
                {2, 4, 7, 12, 14},
                {3, 8, 11, 15, 18},
                {9, 10, 16, 17, 19}
        };

        long startTime = System.nanoTime();

        System.out.println("diagonal print matrix " + Arrays.toString(findDiagonalOrder(matrix)));
//        printMatrixEachItem(matrix);
//        printMatrixEachRow(matrix);
//        printMatrix(matrix);

        long endTime = System.nanoTime();
        System.out.println("That took " + (endTime - startTime) + " nano milliseconds " + "and milliseconds = " + (endTime - startTime) / 1000000);
    }
}
