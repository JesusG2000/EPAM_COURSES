package etc.array_in_array;

import java.util.Scanner;

public class Task40 {
    private static int linesSum;
    private static int columnsSum;
    private static int diagonalsSum;

    public static void main(String[] args) {

        int[][] matrix;
        boolean finish = false;
        int n;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Write matrix size :");
        n=scanner.nextInt();
        matrix = new int[n][n];

        while (!finish) {
            matrix=fillMatrix(n);


            if (checkEveryColums(matrix) && checkEveryLines(matrix) && checkEveryDiagonals(matrix)
                    && linesSum == columnsSum && columnsSum == diagonalsSum) {
                finish = true;
            }

        }
        show(matrix);
    }



    private static boolean checkEveryLines(int [][] matrix){
        int[] mas= new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                mas[i]+=matrix[i][y];
            }
        }
        linesSum=mas[0];
        return allSame(mas);

    }
    private static boolean checkEveryColums(int [][] matrix){
        int[] mas= new int [matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                mas[i]+=matrix[y][i];
            }
        }
        columnsSum=mas[0];
        return allSame(mas);

    }
    private static boolean checkEveryDiagonals(int [][] matrix) {
        int[] mas = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int y = 0; y < matrix[i].length; y++) {
                if (i == y) {
                    mas[0] += matrix[i][y];
                }
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            mas[1]+=matrix[i][matrix.length - 1 - i];
        }
        diagonalsSum=mas[0];
        return allSame(mas);

    }
    private static boolean allSame(int [] mas){
        boolean same=true;
        int number=mas[0];
        for(int i=0 ; i < mas.length ; i++){
            if(number!=mas[i]){
                same=false;
                break;
            }
        }
        return same;
    }
    private static void show(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int y = 0; y < mas[i].length; y++) {
                System.out.print(mas[i][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private   static int [][] fillMatrix(int size){
        int [][]matrix=new int [size][size];
        int []linearMatrix=new int[size*size];
        int []mas=new int[size*size];
        for(int i = 0 ;  i<mas.length;i++){
            mas[i]=i+1;
        }
        int index;
        for(int i = 0, y; i< mas.length ; i+=y){//fill array with random numbers from 1 to size*size
            index= (int)(Math.random()*(size*size));
            if(mas[index]!=0) {
                linearMatrix[i] = mas[index];
                mas[index] = 0;
                y=1;
            }else{
                y=0;
            }
        }
        for(int i = 0 ;  i <size ; i++){
            for(int y = 0 ;  y<size ; y++){
                matrix[i][y]=linearMatrix[i*size+y];
            }
        }
        return matrix;
    }
}
