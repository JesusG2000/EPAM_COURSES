package etc.array_in_array;
// Дана матрица. Вывести на экран первый и последний столбцы.
public class Task3 {
    public static void main(String[] args) {
        int[][] mas = new int[3][4];
        for(int i=0 ; i< mas.length;i++){
            for(int y=0 ;y <mas[i].length;y++){
                mas[i][y]=(int)(Math.random()*9);
            }
        }
        for(int i=0 ; i< mas.length;i++){
            for(int y=0 ;y <mas[i].length;y++){
                System.out.print(mas[i][y]);
            }
            System.out.println();
        }
        for(int i=0 ; i < mas.length;i++){
            System.out.println(mas[i][0]);
        }
        System.out.println();
        for(int i=0 ; i < mas.length;i++){
            System.out.println(mas[i][mas.length]);
        }
    }
}
