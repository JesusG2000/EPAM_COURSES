package etc.array_in_array;
// Найдите сумму двух матриц
public class Task38 {
    public static void main(String[] args) {
        int[][] firstMas;
        int[][] secondMas;
        int[][] result;
        int size = 3;

        firstMas = new int[size][size];
        secondMas = new int[size][size];
        result = new int[size][size];

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


        for (int i = 0; i < firstMas.length; i++) {
            for (int y = 0; y < firstMas[i].length; y++) {
                result[i][y]=firstMas[i][y]+secondMas[i][y];
                System.out.print(result[i][y]+" ");
            }
            System.out.println();
        }

    }
}
