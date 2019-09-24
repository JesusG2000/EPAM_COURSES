package etc.array_in_array;
// Найдите произведение двух матриц.
public class Task39 {
    public static void main(String[] args) {
        int[][] firstMas;
        int[][] secondMas;
        int size=3;

        firstMas = new int[size][size];
        secondMas=new int[size][size];

        for (int i = 0; i < firstMas.length; i++) {
            for (int y = 0; y < firstMas[i].length; y++) {
                firstMas[i][y] = (int) (Math.random() * 10);
                secondMas[i][y] = (int) (Math.random() * 10);
                System.out.print(firstMas[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < firstMas.length; i++) {
            for (int y = 0; y < firstMas[i].length; y++) {
                System.out.print(secondMas[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();


        int m = firstMas.length;
        int n = secondMas[0].length;
        int o = secondMas.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += firstMas[i][k] * secondMas[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int y = 0; y < res[i].length; y++) {
                System.out.print(res[i][y]+" ");
            }
            System.out.println();
        }
    }
}
