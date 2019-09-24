package etc.array;
//1. Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0
//< L < М-1).
public class Task11 {
    public static void main(String[] args) {
        int []mas={1,32,35,345,345,34,123,458};
        int m=5;
        int l=3;

        for(int i=0 ; i < mas.length;i++){
            if(mas[i]%m==l){
                System.out.println(mas[i]);
            }
        }
    }
}
