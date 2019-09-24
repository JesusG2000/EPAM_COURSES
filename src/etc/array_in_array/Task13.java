package etc.array_in_array;
// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
public class Task13 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            if(i%2==0) {
                for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = y + 1;
                    System.out.print(matrix[i][y] + " ");
                }
            }else{
                for (int y = matrix[i].length-1; y >-1; y--) {
                    matrix[i][y] = y +1;
                    System.out.print(matrix[i][y] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
