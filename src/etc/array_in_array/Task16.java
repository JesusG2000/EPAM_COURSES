package etc.array_in_array;

public class Task16 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if(i==y) {
                    matrix[i][y] = (i+1)*(i+2);
                }
                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
