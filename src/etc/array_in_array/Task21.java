package etc.array_in_array;

public class Task21 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int t=1;
        for (int i = 0; i < matrix.length; i++) {
            int digital=matrix.length+1-t;
            for (int y = 0; y < t; y++) {
               matrix[i][y]=digital;
               digital++;
            }
            t++;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {



                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }
    }
}
