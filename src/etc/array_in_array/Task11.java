package etc.array_in_array;
// Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа
//налево, вторая строка слева направо, третья строка справа налево и так далее.
public class Task11 {
    public static void main(String[] args) {
        int[][] matrix;


        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 9 + 1);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int y = 0; y < matrix[i].length; y++) {
                    System.out.print(matrix[i][y] + " ");
                }
            } else {
                for (int y = matrix[i].length-1; y > -1; y--) {
                    System.out.print(matrix[i][y] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}

