package etc.array_in_array;
//Получить квадратную матрицу порядка n:
//0 0 0 0 −1
//0 0 2 0 0
//0 1 0 0 0
//0 0 0 0 0

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if(i==y) {
                    matrix[i][y] = i;
                }
                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }
}
