package etc.array_in_array;

public class Task18 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int t=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length-t; y++) {
                matrix[i][y]=i+1;
            }
            t++;
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
