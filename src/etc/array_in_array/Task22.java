package etc.array_in_array;

public class Task22 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int t=matrix.length;
        int decrement=0;
        for (int i = 0; i < matrix.length; i++) {
            int digital=matrix.length+1-t;
            for (int y = 0; y < matrix.length-decrement; y++) {
                matrix[i][y]=digital;
                digital++;
            }
            decrement++;
            t--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {



                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }
    }
}
