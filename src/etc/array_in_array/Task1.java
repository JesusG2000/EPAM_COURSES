package etc.array_in_array;



//Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна
//единица, и вывести на экран.
public class Task1 {
    public static void main(String[] args) {
        int[][] mas = new int[3][4];
        for (int i = 0; i < mas.length; i++) {
           mas[i][(int)(Math.random()*mas[i].length)]=1;
        }
        for(int i=0 ; i< mas.length;i++){
            for(int y=0 ;y <mas[i].length;y++){
                System.out.print(mas[i][y]);
            }
            System.out.println();
        }
    }
}
