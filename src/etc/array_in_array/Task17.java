package etc.array_in_array;
//. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Task17 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
               if(i==0){
                   matrix[i][y]=1;
               }else if(i==matrix.length-1){
                   matrix[i][y]=1;
               }else{
                   matrix[i][0]=1;
                   matrix[i][matrix.length-1]=1;
               }
                System.out.print(matrix[i][y]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
