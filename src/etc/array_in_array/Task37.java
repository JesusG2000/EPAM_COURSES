package etc.array_in_array;
// Переставить строки матрицы случайным образом.
public class Task37 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() *10);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        replace(matrix,0,1);

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }


    }

    private static int[][] replace(int[][]mas,int first,int second) {
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                if(y==first){
                    int replace=mas[i][y];
                    mas[i][y]=mas[i][second];
                    mas[i][second]=replace;
                }
            }
        }
        return mas;
    }
}
