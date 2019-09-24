package etc.array_in_array;

import java.util.Arrays;

//С клавиатуры вводится двумерный массив чисел размерностью nxm. Выполнить с массивом
//следующие действия:
//а) вычислить сумму отрицательных элементов в каждой строке;
//б) определить максимальный элемент в каждой строке;
//в) переставить местами максимальный и минимальный элементы матрицы.
public class Task26 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int[] sumInStr = new int[matrix.length];
        int[] maxInStr = new int[matrix.length];
        int max = 0;
        int min=0;
        int indexMaxX=0;
        int indexMaxY=0;
        int indexMinX=0;
        int indexMinY=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 10-5);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        max=matrix[0][0];
        min=matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            maxInStr[i] = matrix[i][0];

            for (int y = 0; y < matrix[i].length; y++) {
                if (matrix[i][y] < 0) {
                    sumInStr[i] += matrix[i][y];
                }
                maxInStr[i]=Math.max(maxInStr[i],matrix[i][y]);

                if(max<matrix[i][y]){
                    max=matrix[i][y];
                    indexMaxY=y;
                    indexMaxX=i;
                }
                if(min>matrix[i][y]){
                    min=matrix[i][y];
                    indexMinY=y;
                    indexMinX=i;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(sumInStr));
        System.out.println(Arrays.toString(maxInStr));
        System.out.println(max);
        System.out.println(min);
        matrix[indexMinX][indexMinY]=max;
        matrix[indexMaxX][indexMaxY]=min;
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
    }
}

