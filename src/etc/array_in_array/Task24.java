package etc.array_in_array;

public class Task24 {
    public static void main(String[] args) {
        int mas[]=new int[]{1,2,2,34,24,11,4};

        double[][] matrix;
        matrix = new double[mas.length][mas.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                    matrix[i][y] = Math.pow(mas[y],i+1);

                System.out.print(matrix[i][y] + " ");

            }
            System.out.println();
        }

    }
}
