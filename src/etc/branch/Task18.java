package etc.branch;
// Подсчитать количество отрицательных среди чисел а, b, с
public class Task18 {
    public static void main(String[] args) {
        int a=3;
        int b=-3;
        int c=3;
        System.out.println(getCountOfMinus(a,b,c));
    }
    static int getCountOfMinus(double...num){
        int counter=0;
        for(int i=0 ; i < num.length;i++){
            if(num[i]<0){
                counter++;
            }
        }
        return counter;
    }
}
