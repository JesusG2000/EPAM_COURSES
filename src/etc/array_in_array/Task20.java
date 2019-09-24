package etc.array_in_array;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int[][] matrix;
        int number;
        int zeroCount;
        boolean half;
        int n;

        System.out.println("Write matrix size(even)");
        n = new Scanner(System.in).nextInt();
        half = true;
        matrix = new int[n][n];
        zeroCount = 0;

        if (n % 2 == 0) {

            for (int i = 0; i < matrix.length; i++) {
                for (int y = 0; y < matrix[i].length; y++) {

                    for (int z = 0; z < zeroCount+1; z++) {
                        matrix[i][z] = 1;
                        matrix[i][matrix.length - z - 1] = 1;
                    }
                    System.out.print(matrix[i][y] + " ");
                }
                System.out.println();
                if (half) {
                    zeroCount++;
                }
                if (zeroCount == matrix.length / 2 || !half) {
                    zeroCount--;
                    half = false;
                }
            }
        } else {
            System.out.println("It's not even");
        }
    }
}
