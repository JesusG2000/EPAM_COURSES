package etc.array_in_array;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Task15 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if(i==y) {
                    matrix[i][y] = matrix.length-i;
                }
                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
