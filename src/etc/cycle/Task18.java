package etc.cycle;
//8. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:
//n
//n
//n
//a
//1
//( 1)
public class Task18 {
    public static void main(String[] args) {
        double dig=-0.7;
        for(int i=2;i<100;i++){
            double result=Math.pow(-1,i-1)/i;
            if(Math.abs(result)>=dig){
                System.out.println(result);
            }
        }
    }
}
