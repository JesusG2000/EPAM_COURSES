package etc.array_in_array;
// Операция сглаживания матрицы дает новую матрицу того же размера, каждый элемент которой
//получается как среднее арифметическое соседей соответствующего элемента исходной матрицы.
//Построить результат сглаживания заданной матрицы
public class Task36 {
    public static void main(String[] args) {
        int[][] matrix;
        int[][] newMatrix;

        matrix = new int[6][6];
        newMatrix=new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y] = (int) (Math.random() * 10);
                System.out.print(matrix[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if(y==0){
                   newMatrix[i][y]+=matrix[i][y+1]+matrix[i][y];
                }
                else if(y==matrix.length-1){
                    newMatrix[i][y]+=matrix[i][y-1]+matrix[i][y];
                }else{
                    newMatrix[i][y]+=matrix[i][y-1]+matrix[i][y]+matrix[i][y+1];
                }
            }
        }
        System.out.println();


        for (int i = 0; i < newMatrix.length; i++) {
            for (int y = 0; y < newMatrix[i].length; y++) {
                System.out.print(newMatrix[i][y] + " ");
            }
            System.out.println();
        }
    }
}
