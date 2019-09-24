package etc.array_in_array;

public class Task25 {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[6][6];
        int t=1;
        int up=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                matrix[i][y]=t+y;
                System.out.print(matrix[i][y] + " ");

            }
            t=matrix.length*up+1;
            up++;
            System.out.println();
        }
    }
}
